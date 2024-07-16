package Q0405;

public class Box2Example {
	public static void main(String[] args) {
		Box2<String> box1 = new Box2<String>();
		box1.set("ȫ�浿");
		String str = box1.get();
		System.out.println(str);
		
		Box2<Integer> box2 = new Box2<Integer>();
		box2.set(6);
		int value = box2.get();
		System.out.println(value);
	}

}
