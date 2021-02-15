package practice;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		//동전 케이스에 동전을 끼움.
		//100원, 50원, 10원 순서로 넣는다.
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(10));
		while(!coinBox.isEmpty()) { //코인박스 비워지지 않을 동안~
			Coin coin = coinBox.pop(); //꺼내기
			System.out.println("꺼내온 동전: " + coin.getValue()+"원");
		}//후입선출 lifo
		
		
		
	}

}
