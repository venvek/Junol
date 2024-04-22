package StackE;

import java.util.Stack;

/*class Coin {
	public int coin;

	public Coin(int coin) {
		this.coin = coin;
	}

	public int getCoin() {
		return coin;
	}

	public void setCoin() {
		this.coin = coin;
	}

	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

}*/

public class StackExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Coin> coinBox = new Stack<coin>();

		coinBox.push(new Coin(20));
		coinBox.push(new Coin(70));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(130));

		while (!coinBox.isEmpty()) {
		Coin coin = coinBox.pop();
		System.out.println("거내온 동전 : " + coin.getValue() + " 원");

	}
}
}