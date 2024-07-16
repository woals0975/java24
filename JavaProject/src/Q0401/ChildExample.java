package Q0401;

public class ChildExample  {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = new Parent();
		
		parent.method1();
		parent.method2();
//      parent.method3(); 3가 읎다
		
		child.method1(); //자식에게는 없지만 부모에게 있는거
		child.method2(); //부모 자식의 메소드 이름이 같아서 오버라이딩된 자식꺼 출력
		child.method3();
		
		parent = child;    //부모의 주소값이 자식의 주소값으로 덮여씌어짐
		parent.method1();  // 상속받은 부모1 출력
		parent.method2();  // 오버라이딩된 자식2출력
	}

}
