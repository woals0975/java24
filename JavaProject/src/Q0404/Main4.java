package Q0404;

public class Main4 {
	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���"); //���α׷����̶�� ���ڰ� subject�� ���°�� �����ϴ°�(ù�ε���)
		System.out.println("location : " + location);
		
		if(subject.indexOf("�ڹ�") != -1) {
			System.out.println("�ڹٿ� ������ �ֽ��ϴ�.");
		} else {
			System.out.println("�ڹٿ� ������ �����ϴ�.");
		}
	}

}
