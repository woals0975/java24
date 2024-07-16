package Q0411;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowTest2 extends WindowAdapter {
	private Frame frame;
	private Button b1,b2,b3;
	
	public FlowTest2() {
		frame = new Frame("adapter example");
		b1 = new Button("Ok");
		b2 = new Button("Open");
		b3 = new Button("Close");		
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public void startFrame() {
		frame.addWindowListener(this);
		frame.setLayout(new FlowLayout());
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowTest2 g = new FlowTest2();
		g.startFrame();

	}

}
