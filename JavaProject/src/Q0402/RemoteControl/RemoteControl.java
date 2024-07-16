package Q0402.RemoteControl;

public interface RemoteControl {
	public int MAX_VOLUME = 10; //인터페이스라 final 안써도 상수
	public int MIN_VLOUME = 0;
	
	public void turnOn(); //인터페이스라 abstract 안써도 추상 클래스
	public void turnOff();
	public void setVolume(int volume);
	
	//defalt method
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다.");
		}else { 
			System.out.println("무ㅡ음 해제 합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}

}
