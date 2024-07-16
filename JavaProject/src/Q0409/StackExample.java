package Q0409;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(20));
		coinBox.push(new Coin(27));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(130));
		
		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("������ ���� : " +coin.getValue() + " ��");
		}
	}
}

class Coin{
	private int value;
	
	public Coin(int value) {
		this.value = value;
		// TODO Auto-generated constructor stub
	}

	

	public int getValue() {
		return value;
	}
}




	
	

