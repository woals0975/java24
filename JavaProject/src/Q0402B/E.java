package Q0402B;

public class E {
	void method() {
		class F {
			F() {}
			int field1; //인스턴스 필드
			//static int field2; // 정적x
			void method1() { // 인스턴스 메소드
				System.out.println("class E - method() - class F - method1()");
			}
		}
		F f = new F();
		f.field1 = 7;
		System.out.println("f.field1 : " + f.field1);
		f.method1();
	}

}
