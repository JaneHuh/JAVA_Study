package org.java_study.hw1_BronzeV;

import java.util.Scanner;

public class MatrixAddition_2738 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int num = sc.nextInt();
				if (num >= -100 && num <= 100) A[i][j] = num;
				num = 0;
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int num = sc.nextInt();
				if (num >= -100 && num <= 100) B[i][j] = num;
				num = 0;
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(A[i][j] + B[i][j] + " ");
			}
			System.out.println();
		}

	}
}