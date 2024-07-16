package Q0404;

import java.util.Random;
import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] in = new int[3];
		Random random = new Random(); // ���� ����

		for (int i = 0; i < in.length; i++) {
			in[i] = random.nextInt(9) + 1; // 1~9���� //(i) i-1������ +1�������
			for (int j = 0; j < i; j++) {
				if (in[i] == in[j]) {
					i--; // �ߺ��� �ٽ� �̱�
				}
			}
		}

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int S = 0; // �� �õ����� 0���� ������Ѵ�.
			int B = 0;
			if (a == in[0]) {
				S = S + 1;
			} else if (a == in[1] || a == in[2]) {
				B = B + 1;
			}
			if (b == in[1]) {
				S = S + 1;
			} else if (b == in[0] || b == in[2]) {
				B = B + 1;
			}
			if (c == in[2]) {
				S = S + 1;
			} else if (c == in[0] || c == in[1]) {
				B = B + 1;
			}
			if (S == 3) {
				System.out.print("Game Over!");
				sc.close();
				break;
			}
			System.out.printf("%dStrike %dBall\n", S, B);
		}

	}
}
