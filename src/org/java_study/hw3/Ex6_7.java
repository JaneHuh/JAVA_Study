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

	static void change(Data2 d) { // ������ �Ű�����
		d.x = 1000; //���纻��. ������ �ƴ�
		System.out.println("change(): x = "+ d.x);
	}

}