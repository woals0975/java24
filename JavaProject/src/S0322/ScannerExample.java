package S0322;

import java.util.Scanner;


public class ScannerExample {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		//스캐너 선언
		System.out.print("x 값 입력: ");
		String strX = sc.nextLine();//라인은 공백 포함 ABC DEF 면 전부
		            //sc.next();  그냥은 공백전까지 얘는 ABC만
		int x = Integer.parseInt(strX);
		//타입 변환 
		
		System.out.print("y 값 입력: ");
		String strY = sc.nextLine();
		int y = Integer.parseInt(strY);
		 
		int result = x + y;
		System.out.println("x + y: " + result);
		System.out.println();
		
		while(true) { //트루면 도는데 조건이 트루라 무한루프
			System.out.print("입력 문자열: ");
			String data = sc.nextLine();
			if(data.equals("q")) { //루프 빠져나가는 조건을 만들어줘야함
				break;
				
			}
			System.out.println("출력 문자열: " +data);
			System.out.println();
		}
		sc.close();
		System.out.println("종료");
		
	}

}
