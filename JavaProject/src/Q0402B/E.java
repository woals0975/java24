package Q0402B;

public class E {
	void method() {
		class F {
			F() {}
			int field1; //�ν��Ͻ� �ʵ�
			//static int field2; // ����x
			void method1() { // �ν��Ͻ� �޼ҵ�
				System.out.println("class E - method() - class F - method1()");
			}
		}
		F f = new F();
		f.field1 = 7;
		System.out.println("f.field1 : " + f.field1);
		f.method1();
	}

}
