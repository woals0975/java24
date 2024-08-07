package Q0419;

import java.io.*;
import java.sql.*;

public class BoardWithFIleInsertExample {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");

			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "c##green", // ID
					"green1234"// PW
			);
			
			String sql = "" +
			"INSERT INTO boards(bno,btitle,bcontent,bwriter,bdate,bfilename,bfiledata)" +
			"VALUES (SEQ_BNO.NEXTVAL,?,?,?,SysDATE,?,?)";
			
			PreparedStatement pstmt = conn.prepareStatement(sql,new String[] {"bno"});
			pstmt.setString(1,"눈 오는 날");
			pstmt.setString(2,"함박눈이 내려요.");
			pstmt.setString(3,"winter");
			pstmt.setString(4,"but.jpg");
			pstmt.setBlob(5, new FileInputStream("src/but.jpg"));
			
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수 : "+rows);
			
			if(rows == 1) {
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()) {
					int bno = rs.getInt(1);
					System.out.println("저장된 bno :" + bno);
				}
				rs.close();
			}
			pstmt.close();
		} catch (Exception e) {
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
