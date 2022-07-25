package org.java_study.hw4;

final class Singleton {
	private static Singleton s = new Singleton();

	private Singleton() { // ������
		// ...
	}

	public static Singleton getInstance() { //������ ��ü�� ������ ��ȯ�ϴ� �� 
		if (s == null) { //������ null�� ��쿡�� ���ο� ��ü�� ����
			s = new Singleton();
		}
		return s;
	}

}

class SingletonTest {
	public static void main(String[] args) {
		//Singleton s = new Singleton(); //����
		Singleton s1 = Singleton.getInstance();
	}
}
