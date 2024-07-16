package Q0419;

import java.io.*;
import java.sql.*;

public class BoardSelectExample {
	public static void main(String[] args) throws IOException {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");

			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", 
					"c##green", // ID
					"green1234"// PW
			);

			String sql = "" +
					"SELECT bno,btitle,bcontent,bwriter,bdate,bfilename,bfildata "+
					"FROM boards "+
					"WHERE bwriter=?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBfilename(rs.getString("bfilename"));
				board.setBfiledata(rs.getBlob("bfiledata"));
				
				System.out.println(board);
				
				Blob blob = board.getBfiledata();
				if(blob!=null) {
					InputStream is = blob.getBinaryStream();
					OutputStream os = new FileOutputStream("D:" + board.getBfilename());
					board.getBfilename();
					is.transferTo(os);
					os.flush();
					os.close();
					is.close();
				}
				
			}
			rs.close();
			
			pstmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			
	}

}
	}
}
