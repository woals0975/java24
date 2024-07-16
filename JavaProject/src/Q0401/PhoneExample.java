package Q0401;

public class PhoneExample {
	public static void main(String[] args) {
		// Phone phone = new SmartPhone("홍길동");
		//Phone phone = new Phone("홍길동"); //폰클래스는 추상클래스라 인스턴스 생성 불가	
											//레퍼런스는 가능
			
		Phone phone2 = new SmartPhone("임꺽정");
		phone2.turnOn();
		phone2.turnOff();
		
		SmartPhone phone3 = new SmartPhone("홍길동");
		phone3.turnOn();
		phone3.internetSearch();
		phone3.turnOff();
	}

}





//SmartPhone smartPhone = new SmartPhone("홍길동");
//smartPhone.turnOn();
//smartPhone.internetSearch();
//smartPhone.turnOff();
