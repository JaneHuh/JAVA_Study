package org.java_study.hw2;

import java.util.Scanner;

public class Multiplication_2588 { // ����

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		String str2 = Integer.toString(num2); // int -> String

		for (int i = str2.length() - 1; i >= 0; i--) {
			int temp = num1 * (str2.charAt(i) - '0'); // - '0'�� ���־�� �ƽ�Ű�ڵ� x
			System.out.println(temp);

		}

		System.out.println(num1 * num2);

	}

}
