package S0322;

import java.util.Scanner;


public class ScannerExample {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		//��ĳ�� ����
		System.out.print("x �� �Է�: ");
		String strX = sc.nextLine();//������ ���� ���� ABC DEF �� ����
		            //sc.next();  �׳��� ���������� ��� ABC��
		int x = Integer.parseInt(strX);
		//Ÿ�� ��ȯ 
		
		System.out.print("y �� �Է�: ");
		String strY = sc.nextLine();
		int y = Integer.parseInt(strY);
		 
		int result = x + y;
		System.out.println("x + y: " + result);
		System.out.println();
		
		while(true) { //Ʈ��� ���µ� ������ Ʈ��� ���ѷ���
			System.out.print("�Է� ���ڿ�: ");
			String data = sc.nextLine();
			if(data.equals("q")) { //���� ���������� ������ ����������
				break;
				
			}
			System.out.println("��� ���ڿ�: " +data);
			System.out.println();
		}
		sc.close();
		System.out.println("����");
		
	}

}
