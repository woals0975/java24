package Q0402B;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.print("args[0] : \n" + data1);
			System.out.print("args[1] : " + data2);
		}else {
			System.out.println("[���� ���]");
			System.out.println("jajva ArrayOutOfBoundsExceptionExample");
			System.out.println("��1 ��2");
		}
	}

}
