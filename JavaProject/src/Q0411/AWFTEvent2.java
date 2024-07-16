package Q0411;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWFTEvent2 {
	private Frame frame;
	private Button b1,b2,b3,b4,b5;
	
	public AWFTEvent2() {
		frame = new Frame("event Handler example");
		b1 = new Button("Button1");
		b1 = new Button("Button2");
		b1 = new Button("Button3");
		b1 = new Button("Button4");
		b1 = new Button("Button5");
	}

	
	public void startFrame() {
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button1 Click!");
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button2 Click!");
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button3 Click!");
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button4 Click!");
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button5 Click!");
			}
		});
		
		frame.add(b1,BorderLayout.NORTH);
		frame.add(b2,BorderLayout.SOUTH);
		frame.add(b3,BorderLayout.WEST);
		frame.add(b4,BorderLayout.EAST);
		frame.add(b5,BorderLayout.CENTER);
		frame.setSize(200,200);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		AWFTEvent2 border = new AWFTEvent2();
		border.startFrame();
	}
}
