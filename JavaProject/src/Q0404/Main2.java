package Q0404;

public class Main2 {
	public static void main(String[] args) { //������ byte long int char
		byte[] bytes = { 72, 101, 108,108, 111, 32, 74, 97, 118, 97}; //�ƽ�Ű�ڵ�
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
		System.out.printf("%c", 65);
		System.out.printf("%c", 97);
	}

}
