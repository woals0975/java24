package Q0402B;

public class AB {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		System.out.println("b.field1 : " + b.field1);
	}
}

