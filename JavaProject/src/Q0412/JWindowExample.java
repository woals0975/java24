package Q0412;

import java.awt.BorderLayout;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;

public class JWindowExample extends JWindow {
	public JWindowExample() {
		this.setSize(600,350);
		
		
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		Point centerPoint = ge.getCenterPoint();
		int leftTopx = centerPoint.x - this.getWidth()/2;
		int lightTopy = centerPoint.y - this.getHeight()/2;
		this.setLocation(leftTopx,lightTopy);
		
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(getClass().getResource("But.jpg")));
		getContentPane().add(label, BorderLayout.CENTER);
		
		this.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JWindowExample jWindow = new JWindowExample();
				jWindow.setVisible(true);
			}
		});
	}

}
