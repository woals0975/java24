package Q0405;

public class Thread2Example {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸�: " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("���α׷� ���� ������ �̸�: " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("���α׷� ���� ������ �̸�: " + threadB.getName());
		threadB.start();
		
	}

}
