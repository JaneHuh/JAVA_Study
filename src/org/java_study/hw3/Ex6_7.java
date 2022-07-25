package org.java_study.hw3;

class Data2 {
	int x;
}

class Ex6_7 {

	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main(): x = " + d.x);

		change(d);
		System.out.println("After change(d.x)");
		System.out.println("main(): x = " + d.x);

	}

	static void change(Data2 d) { // 참조형 매개변수
		d.x = 1000; //복사본임. 원본이 아님
		System.out.println("change(): x = "+ d.x);
	}

}