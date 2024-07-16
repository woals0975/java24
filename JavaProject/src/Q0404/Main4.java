package Q0404;

public class Main4 {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍"); //프로그래밍이라는 글자가 subject에 몇번째에 존재하는가(첫인덱스)
		System.out.println("location : " + location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련이 있습니다.");
		} else {
			System.out.println("자바와 관련이 없습니다.");
		}
	}

}
