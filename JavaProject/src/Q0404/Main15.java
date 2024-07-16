package Q0404;

import java.util.*;


public class Main15 {
	public static void main(String[] args) {
		int[] scores = { 99, 68, 36, 29, 88 };

		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]" + scores[i]);
		}

		String[] names = { "�垮瘚�", "夢翕熱", "梯團熱" };
		Arrays.sort(names, Collections.reverseOrder());  //羲牖
		for (int i = 0; i < names.length; i++) {
		System.out.println("names[" + i + "]" + names[i]);
		}
		/*
		 * for (int i = 0; i < names.length; i++) { System.out.println("names[" + i +
		 * "]" + names[i]); }
		 */

}
}
