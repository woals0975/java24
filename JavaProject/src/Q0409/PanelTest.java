package Q0409;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class PanelTest {
	private Frame f;
	private Panel p;
	private Button ok, cancel;
	private TextField tf1;
	
	public PanelTest() {
		f = new Frame("panel example");
		ok = new Button("����");
		cancel = new Button("����");
		tf1 = new TextField("Input...");
		p = new Panel();
	}
	
	public void startFrame() {
		f.add(tf1, BorderLayout.NORTH);
		p.setBackground(Color.blue);
	5	p.add(ok);
		p.add(cancel);
		f.add(p, BorderLayout.CENTER);
		
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		PanelTest g = new PanelTest();
		g.startFrame();
	}
}
