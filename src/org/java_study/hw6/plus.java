package org.java_study.hw6;

public class plus { // 1~10 �� ���ϱ� 

	public static void main(String[] args) {
		System.out.println(plus(10));

	}

	public static int plus(int n) {
		if (n == 0) {
			return 0;
		}
		return n + plus(n - 1); // �߿�..(����� ����)

	}
}
