package org.java_study.hw6;

public class plus { // 1~10 합 구하기 

	public static void main(String[] args) {
		System.out.println(plus(10));

	}

	public static int plus(int n) {
		if (n == 0) {
			return 0;
		}
		return n + plus(n - 1); // 중요..(어려운 내용)

	}
}
