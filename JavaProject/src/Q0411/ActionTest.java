package Q0411;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class ActionTest {
	private Frame f;
	private Button b1,b2,b3,b4,b5;
	
	public ActionTest() {
		f = new Frame("event handler example2");
		b1 = new Button("Button1");
		b2 = new Button("Button2");
		b3 = new Button("Button3");
		b4 = new Button("Button4");
		b5 = new Button("Button5");
	}
	
	public void startFrame() {
		b1.addActionListener(new ActionHandler());
		b2.addActionListener(new ActionHandler());
		b3.addActionListener(new ActionHandler());
		b4.addActionListener(new ActionHandler());
		b5.addActionListener(new ActionHandler());
		
		f.add(b1, "North");
		f.add(b2, "South");
		f.add(b3, "West");
		f.add(b4, "East");
		f.add(b5, BorderLayout.CENTER); // 위에껀 오타나면 오류떠서 그것을 줄이기 위해 이걸 사용하면 좋다.
		
		f.setSize(300,300);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		ActionTest border = new ActionTest();
		border.startFrame();
	}

}
