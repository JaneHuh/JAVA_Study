package org.java_study.hw4;

final class Singleton {
	private static Singleton s = new Singleton();

	private Singleton() { // 생성자
		// ...
	}

	public static Singleton getInstance() { //생성된 객체의 참조를 반환하는 것 
		if (s == null) { //참조가 null인 경우에는 새로운 객체를 생성
			s = new Singleton();
		}
		return s;
	}

}

class SingletonTest {
	public static void main(String[] args) {
		//Singleton s = new Singleton(); //에러
		Singleton s1 = Singleton.getInstance();
	}
}
