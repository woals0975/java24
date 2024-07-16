package test2;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.imageio.ImageIO;
public class MyClass  extends ConnectionB {
	
	public void MyClass2() throws Exception {
		try {
			Image image;
			Image resizeImage;
		image = ImageIO.read(new File("C:/Users/Manic-063/git/AccountManagement/src/test/after.jpg"));
		
		resizeImage = image.getScaledInstance(70, 90, Image.SCALE_SMOOTH);
		
		BufferedImage newImage = new BufferedImage(70, 90, BufferedImage.TYPE_INT_RGB);
		
		Graphics g = newImage.getGraphics();
		g.drawImage(resizeImage, 0, 0, null);
		g.dispose();
		
		ConnectionB cb = new ConnectionB(); // 연결
		Connection conn = DriverManager.getConnection(URL, USERID, USERPWD);
		String sql = "" + "insert into post(blob) "
				+ "values(?) where bcno = 41";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, g.toString());
		
		}catch (SQLException e2) {
			e2.printStackTrace();
		}
		//ImageIO.write(newImage, "jpg", new File("C:/Users/Manic-063/git/AccountManagement/src/test/after4.jpg"));
		

	}
		public static void main(String[] args) {
			MyClass mc = new MyClass();
			try {
				mc.MyClass2();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}

   
