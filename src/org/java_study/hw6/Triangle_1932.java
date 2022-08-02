package org.java_study.hw6;

import java.util.Scanner;

public class Triangle_1932 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				// System.out.println(i+ " " + j+" "+arr[i - 1][j] + " " +arr[i][j] + " " + arr[i][j + 1]);
				arr[i - 1][j] += Math.max(arr[i][j], arr[i][j + 1]);
				// System.out.println(arr[i - 1][j]);
			}
		}

		System.out.println(arr[0][0]);

	}

}
