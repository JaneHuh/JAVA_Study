package org.java_study.hw6;

public class boom { // 10 9 8 .. 1 �����ϰ� "��" ����ϱ�

	public static void main(String[] args) {
		boom(10);
	}

	public static void boom(int n) {
		if (n == 0) {
			System.out.println("��");
			return;
		} 
		System.out.println(n);
		boom(n - 1); 

	}

}
