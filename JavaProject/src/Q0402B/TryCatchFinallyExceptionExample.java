package Q0402B;

public class TryCatchFinallyExceptionExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1=args[0];
			data1=args[1];
			
			System.out.println(data1);
			System.out.println(data2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�.");
			System.out.println("[���� ���]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExamlple num1 num2");
			return;
		}
	}

}

