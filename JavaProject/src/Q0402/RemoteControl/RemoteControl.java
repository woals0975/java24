package Q0402.RemoteControl;

public interface RemoteControl {
	public int MAX_VOLUME = 10; //�������̽��� final �Ƚᵵ ���
	public int MIN_VLOUME = 0;
	
	public void turnOn(); //�������̽��� abstract �Ƚᵵ �߻� Ŭ����
	public void turnOff();
	public void setVolume(int volume);
	
	//defalt method
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó�� �մϴ�.");
		}else { 
			System.out.println("������ ���� �մϴ�.");
		}
	}
	
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}

}
