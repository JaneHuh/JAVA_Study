package org.java_study.hw3;

import java.util.Scanner;

public class Receipt_25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int X = sc.nextInt();
		int N = sc.nextInt();

		for (int i = 0; i < N; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum += a * b;
		}

		if (X == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
