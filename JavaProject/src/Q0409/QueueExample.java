package Q0409;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "ȫ�浿"));
		messageQueue.offer(new Message("sendSMS", "���ڹ�"));
		messageQueue.offer(new Message("sendKakaoTalk", "ȫ�β�"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail" :
				System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
				break;
			case "sendSMS" :
				System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");
				break;
			case "sendKakaoTalk" :
				System.out.println(message.to) + "�Կ��� īī������ �����ϴ�.");
				break;
			}
		}
	}

}

public class Message{
	private String to;
	private String command;
	
	public Message(String comand,String to) {
		this.command = command;
		this.to =to;
	}
}

	
