package Q0404;

public class Main11 {
	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-simon";
		
		String[] names = text.split("&|,|-"); // & , - 기준으로 자른다.
		for(String name : names) {
			System.out.println(name);
		}
	}

}
