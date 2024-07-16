package Q0419;

import java.sql.*;
public class ConnectionExample {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"c##green",//ID
					"green1234"//PW
					);
			
			System.out.println("연결 성공");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
					System.out.println("연결 끊기");
				}catch (SQLException e) {}
				}
			}
					
		
	}

}
