package S0322;

public class Operator11Example {
	public static void main(String [] args) {
		int x = 1000000, y= 1000000;
		
		int iz = x * y;
		long lz1 = (long)x * (long)y;
		long lz2 = (long)(x * y);
		
		System.out.println(iz);
		System.out.println(lz1);
		System.out.println(lz2);
		
}
}
