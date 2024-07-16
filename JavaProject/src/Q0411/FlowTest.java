package Q0411;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FlowTest implements WindowListener, ActionListener {
	private Frame frame;
	private Button b1, b2, b3;

	public FlowTest() {
		frame = new Frame("adapter example");
		b1 = new Button("Ok");
		b2 = new Button("Open");
		b3 = new Button("Close");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Welcome!");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Bye!");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	public void startFrame() {
		frame.addWindowListener(this);
		frame.setLayout(new FlowLayout());

		b1.addActionListener(new FlowTest()); // 눌렸을때 신호주기
		b2.addActionListener(new FlowTest()); // FlowTest에서 actionperfomed를 찾아서 신호에 맞는 액션을 실행
		b3.addActionListener(new FlowTest());	

		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) { // 눌렸다는 신호 받으면 나오는 액션
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Ok")) {
			System.out.println("OK");
		}
		if (e.getActionCommand().equals("Open")) {
			System.out.println("OPEN");
		}
		if (e.getActionCommand().equals("Close")) {
			System.exit(0);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowTest g = new FlowTest();
		g.startFrame();

	}
}
