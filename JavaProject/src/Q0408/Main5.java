package Q0408;

import java.util.HashSet;
import java.util.Set;


public class Main5 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("ȫ�浿", 30));
		
		System.out.println("�� ��ü �� : " + set.size());
		
	}
	

}
