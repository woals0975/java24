package Q0411;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest implements ActionListener {
	private Frame f;
	private Button b1;
	private TextField id, pwd, log;
	private Label lid, lpwd;
	private String mid = "green";  //������ ���̵�� ���
	private String mpwd = "ubj1234";

	public void startFrame() {
		f = new Frame("Login");
		lid = new Label("ID : ", Label.RIGHT);
		lpwd = new Label("Passowrd : ", Label.RIGHT);
		id = new TextField(10);
		pwd = new TextField(10);
		log = new TextField("�α��� ���ּ���", 10);
		b1 = new Button("Ȯ��");
		pwd.setEchoChar('*');
		b1.addActionListener(this);
		f.setSize(400, 75);
		f.setLayout(new FlowLayout()); //flowLayout���� �⺻������ �ٸ��� ���ϸ� null�� �����ϰ� ��ġ ũ�� �� ������������Ѵ�.
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(b1);
		f.add(log);
		f.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Ȯ��")) {
			String id2 = id.getText(); // �ؽ�Ʈ�ʵ忡 ������ ��Ʈ������ ����
			String pwd2 = pwd.getText();
			if (id != null) {
				if (id2.equals(mid) && pwd2.equals(mpwd)) { // �����ص� ���� ������ ���̵� ����� ��
					log.setText("�α��� ����");
				} else if (id2.equals(mid) == false || pwd2.equals(mpwd) == false) {
					log.setText("�α��� ����");
				}

			}
		}

	}

	public static void main(String[] args) {
		TextFieldTest g = new TextFieldTest();
		g.startFrame();

	}
}
