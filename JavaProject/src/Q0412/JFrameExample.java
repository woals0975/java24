package Q0412;

import java.awt.GraphicsEnvironment;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JFrameExample extends JFrame {
	public JFrameExample() {
		this.setSize(600,500);
		this.setIconImage(new ImageIcon(getClass().getResource("But.jpg")).getImage());
		this.setTitle("∏ﬁ¿Œ√¢");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		Point centerPoint = ge.getCenterPoint();
		int leftTopx = centerPoint.x = this.getWidth()/2;
		int leftTopy = centerPoint.y = this.getHeight()/2;
		this.setLocation(leftTopx,leftTopy);
	}
		public static void main(String[] args) {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					JFrameExample jFrame = new JFrameExample();
					jFrame.setVisible(true);
				}
			});
		}

}


