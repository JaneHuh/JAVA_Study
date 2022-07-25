package org.java_study.hw1_BronzeV;

import java.util.Scanner;

public class MatrixAddition_2738_Multi {
	public static void main(String[] args) { //2740
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		int[][] C = new int[N][M];
		
		System.out.println("A");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int num = sc.nextInt();
				if (num >= -100 && num <= 100) A[i][j] = num;
				num = 0;
			}
		}
		
		System.out.println("B");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int num = sc.nextInt();
				if (num >= -100 && num <= 100) B[i][j] = num;
				num = 0;
			}
		}

		System.out.println("C");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; j < M; j++) {
					C[i][j] += A[i][k] * B[k][j];
				}
			}
			System.out.println();
		}

	}
}
