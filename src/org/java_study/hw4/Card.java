package org.java_study.hw4;

public class Card {
	final int NUMBER;			// ������� ����� �Բ� �ʱ�ȭ ���� �ʰ�
	final String KIND;			// �����ڿ��� �� �ѹ��� �ʱ�ȭ�� �� �ִ�. 
	static int width = 100;
	static int height = 250;
	
	Card(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	Card(){
		this("HEART", 1);
	}
	
	public String toString() { // Object Ŭ���� �� ��ü�� ���ڷ� ǥ���ϴ� toString �޼ҵ带 �������̵�(overriding)
		return "" + KIND + " " + NUMBER;
	}
	
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("HEART", 10);
		Card c3 = new Card("HEART", 3);
		//c.NUMBER = 5;			// ����: Remove 'final' modifier of 'NUMBER'
		System.out.println(c1.KIND);
		System.out.println(c1.NUMBER);
		System.out.println(c2); // �������� c2�� ����Ű�� �ν��Ͻ��� toString �޼��尡 ȣ��ǵ��� ��ӵ�.
		System.out.println(c3);
	}
}
