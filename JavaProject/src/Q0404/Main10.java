package Q0404;

public class Main10 {
	public static void main(String[] args) {
		int i = 19;
		double d = 10.8;
		boolean b = true;
		
		String str1 = String.valueOf(i);
		String str2 = String.valueOf(d);
		String str3 = String.valueOf(b);
		
		int n = Integer.valueOf("253");
						//().valueOf 타입변경할때 쓰면된다.
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(n+2);
	}

}
