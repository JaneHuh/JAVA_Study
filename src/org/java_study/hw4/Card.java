package org.java_study.hw4;

public class Card {
	final int NUMBER;			// 상수지만 선언과 함께 초기화 하지 않고
	final String KIND;			// 생성자에서 단 한번만 초기화할 수 있다. 
	static int width = 100;
	static int height = 250;
	
	Card(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	Card(){
		this("HEART", 1);
	}
	
	public String toString() { // Object 클래스 중 객체를 문자로 표현하는 toString 메소드를 오버라이딩(overriding)
		return "" + KIND + " " + NUMBER;
	}
	
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("HEART", 10);
		Card c3 = new Card("HEART", 3);
		//c.NUMBER = 5;			// 에러: Remove 'final' modifier of 'NUMBER'
		System.out.println(c1.KIND);
		System.out.println(c1.NUMBER);
		System.out.println(c2); // 참조변수 c2가 가리키는 인스턴스의 toString 메서드가 호출되도록 약속됨.
		System.out.println(c3);
	}
}
