package S0321;

public class Operator9Example {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1 :" + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2 :" + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3 :" + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4 :" + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5 :" + result5);
	
		double result6 = (double) v1 / v2;// 5.0/2가됨
		                                //그래서 더 큰 double인 2.5
		System.out.println("result6 :" + result6);
		
		double result7 = v1 / v2; // 오른쪽은 int라 몫 2.0만 나옴
		                          // 0.5 손실
		System.out.println("result7 :" + result7);
	
	}

}
