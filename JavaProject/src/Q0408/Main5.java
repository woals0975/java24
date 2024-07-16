package Q0408;

import java.util.HashSet;
import java.util.Set;


public class Main5 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("È«±æµ¿", 30));
		set.add(new Member("È«±æµ¿", 30));
		
		System.out.println("ÃÑ °´Ã¼ ¼ö : " + set.size());
		
	}
	

}
