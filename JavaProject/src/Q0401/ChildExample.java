package Q0401;

public class ChildExample  {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = new Parent();
		
		parent.method1();
		parent.method2();
//      parent.method3(); 3�� ����
		
		child.method1(); //�ڽĿ��Դ� ������ �θ𿡰� �ִ°�
		child.method2(); //�θ� �ڽ��� �޼ҵ� �̸��� ���Ƽ� �������̵��� �ڽĲ� ���
		child.method3();
		
		parent = child;    //�θ��� �ּҰ��� �ڽ��� �ּҰ����� ����������
		parent.method1();  // ��ӹ��� �θ�1 ���
		parent.method2();  // �������̵��� �ڽ�2���
	}

}
