package Q0411;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest extends WindowAdapter implements ActionListener {
	private Frame frame;
	private Button b1;

	public ButtonTest() {
		frame = new Frame("Login");
		b1 = new Button("확인");
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void startFrame() {
		frame.addWindowListener(this);
		frame.setLayout(null);

		b1.addActionListener(this); //자기 자신을 불러와야 한다.

		b1.setSize(100, 50);
		b1.setLocation(100, 75);
		frame.setSize(300, 200);
		frame.add(b1);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("확인")) {
			frame.setTitle("SimJaeMin");
		}
	}

	public static void main(String[] args) {
		ButtonTest g = new ButtonTest();
		g.startFrame();
	}
}
