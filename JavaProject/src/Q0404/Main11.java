package Q0404;

public class Main11 {
	public static void main(String[] args) {
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-simon";
		
		String[] names = text.split("&|,|-"); // & , - �������� �ڸ���.
		for(String name : names) {
			System.out.println(name);
		}
	}

}
