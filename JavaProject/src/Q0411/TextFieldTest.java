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
	private String mid = "green";  //정해진 아이디와 비번
	private String mpwd = "ubj1234";

	public void startFrame() {
		f = new Frame("Login");
		lid = new Label("ID : ", Label.RIGHT);
		lpwd = new Label("Passowrd : ", Label.RIGHT);
		id = new TextField(10);
		pwd = new TextField(10);
		log = new TextField("로그인 해주세요", 10);
		b1 = new Button("확인");
		pwd.setEchoChar('*');
		b1.addActionListener(this);
		f.setSize(400, 75);
		f.setLayout(new FlowLayout()); //flowLayout으로 기본값설정 다른거 원하면 null로 설정하고 위치 크기 다 직접정해줘야한다.
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
		if (e.getActionCommand().equals("확인")) {
			String id2 = id.getText(); // 텍스트필드에 적힌걸 스트링으로 저장
			String pwd2 = pwd.getText();
			if (id != null) {
				if (id2.equals(mid) && pwd2.equals(mpwd)) { // 저장해둔 값을 정해진 아이디 비번과 비교
					log.setText("로그인 성공");
				} else if (id2.equals(mid) == false || pwd2.equals(mpwd) == false) {
					log.setText("로그인 실패");
				}

			}
		}

	}

	public static void main(String[] args) {
		TextFieldTest g = new TextFieldTest();
		g.startFrame();

	}
}
