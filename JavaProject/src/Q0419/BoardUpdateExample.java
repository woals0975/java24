package Q0419;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardUpdateExample {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");

			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", 
					"c##green", // ID
					"green1234"// PW
			);
			
			String sql = new StringBuilder()
			.append("UPDATE boards SET ")
			.append("btitle=?, ")
			.append("bcontent=?, ")
			.append("bfilename=?, ")
			.append("bfiledata=? ")
			.append("WHERE bno=?")
			.toString();
			
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "�����");
			pstmt.setString(2, "������ ���� ���");
			pstmt.setString(3, "but.jpg");
			pstmt.setBlob(4, new FileInputStream("src/but.jpg"));
			pstmt.setInt(5,1);
			
			int rows = pstmt.executeUpdate();
			System.out.println("������ �� ��" + rows);
			
			pstmt.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
		}

}

}
}
