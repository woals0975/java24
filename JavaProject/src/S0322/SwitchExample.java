package S0322;

public class SwitchExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;  
		             // 0.0=< Math.random()<1.0
		             //  int   0=< Math.random()*6 < 6
		            // 1=< Math.random()*6 < 7
		
			
		switch(num) {
		case 1:
			System.out.println("1���� ���Խ��ϴ�");
			break;
		case 2:
			System.out.println("2���� ���Խ��ϴ�");
			break;
		case 3:
			System.out.println("3���� ���Խ��ϴ�");
			break;
		case 4:
			System.out.println("4���� ���Խ��ϴ�");
			break;
		case 5:
			System.out.println("5���� ���Խ��ϴ�");
			break;
		case 6:
			System.out.println("6���� ���Խ��ϴ�");
			break;	
		   //������ ��������
		}

	}

}
