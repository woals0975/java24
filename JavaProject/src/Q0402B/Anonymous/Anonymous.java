package Q0402B.Anonymous;

public class Anonymous {
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		
		void wake() {
			System.out.println("6시에 일어납니다..");
		}
		
	};
	
	
	void method1() {//메소드
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			
			void wake() {
				System.out.println("7시에 일어납니다..");
				walk();
			}
			
			
		};
		localVar.wake();
	}
	void method2(Person person) {//메소드
		person.wake();
	}

}
