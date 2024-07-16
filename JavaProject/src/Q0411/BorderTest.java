package Q0411;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderTest {
	private Frame f;
	private Button b1,b2,b3,b4,b5;
	
	public BorderTest(){
		f = new Frame("event handler example");
		b1 = new Button("Button1");
		b2 = new Button("Button2");
		b3 = new Button("Button3");
		b4 = new Button("Button4");
		b5 = new Button("Button5");
}

	public class InnerHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getActionCommand().equals("Button1")) {
				System.out.println("Button 1 Click!");
			}
			if(e.getActionCommand().equals("Button2")) {
				System.out.println("Button 2 Click!");
			}
			if(e.getActionCommand().equals("Button3")) {
				System.out.println("Button 3 Click!");
			}
			if(e.getActionCommand().equals("Button4")) {
				System.out.println("Button 4 Click!");
			}
			if(e.getActionCommand().equals("Button5")) {
				System.out.println("Button 5 Click!");
			}
		}
			
		}
	
	public void startFrame() {
		b1.addActionListener(new InnerHandler());
		b2.addActionListener(new InnerHandler());
		b3.addActionListener(new InnerHandler());
		b4.addActionListener(new InnerHandler());
		b5.addActionListener(new InnerHandler());
		
		f.add(b1, BorderLayout.NORTH);
		f.add(b2, BorderLayout.SOUTH);
		f.add(b3, BorderLayout.WEST);
		f.add(b4, BorderLayout.EAST);
		f.add(b5, BorderLayout.CENTER);
		
		f.setSize(300,300);
		f.setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		BorderTest border = new BorderTest();
		border.startFrame();
		
}
}