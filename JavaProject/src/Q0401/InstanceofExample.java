package Q0401;

public class InstanceofExample {
	public static void method1(Parent2 parent2) {
		if (parent2 instanceof Child2) {
			Child2 child = (Child2) parent2;
			System.out.println("method1 - child2�� ��ȯ ����");
		}else {
			System.out.println("method1 - child2�� ��ȯ ����");
		}
	}

	public static void method2(Parent2 parent2) {
		Child2 child = (Child2) parent2;
		System.out.println("method2 - child2�� ��ȯ ����");
	}
	
	public static void main(String[] args) {
		Parent2 parentA = new Child2();
		method1(parentA);
		method2(parentA);
		
		Parent2 parentB = new Parent2();
		method1(parentB);
		method1(parentB);
		
	}
}
