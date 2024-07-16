package Q0404;

import java.util.StringTokenizer;

public class Main12 {
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";

		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken(); // 커서를 다음칸으로 사용전에 커서는 -1에 있다가 한번쓰면 0번 인덱스
			System.out.println(token);
		}
		System.out.println();

		st = new StringTokenizer(text, "/");
		while (st.hasMoreTokens()) { // 다음칸에 토큰이있냐 true false
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
