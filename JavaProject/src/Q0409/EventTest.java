package Q0409;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class EventTest extends WindowAdapter  implements ActionListener   {
	private Frame f;
	private Button b1,b2,b3,b4,b5;
	
	public EventTest() {
		f = new Frame("event handler example");
		b1 = new Button("Button1");
		b2 = new Button("Button2");
		b3 = new Button("Button3");
		b4 = new Button("Button4");
		b5 = new Button("Button5");
	}
	
	public void startFrame() {
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		f.add(b1, "North");
		f.add(b2, "South");
		f.add(b3, "West");
		f.add(b4, "East");
		f.add(b5, "Center");
		
		f.setSize(300, 300);
		f.setVisible(true);
	}
	
	

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
		// TODO Auto-generated method stub

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventTest g = new EventTest();
		g.startFrame();
	}

}
