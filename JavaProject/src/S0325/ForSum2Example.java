package S0325;

import java.util.Scanner;

public class ForSum2Example {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int sum = 0;
		sc.close();
		
		for(int i = 1; i<=inp;i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
	}

}
