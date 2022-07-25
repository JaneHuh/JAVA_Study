package org.java_study.hw4;

import java.util.Scanner;

public class RepaintingTheChessboard_1018 {

	static int N, M;
	static char board[][];
	static int min = 64; //8*8ũ�� ü���ǿ��� �ٲ� �� �ִ� ü������ �ִ��� 64��

	// 8*8ũ���� ü�������� �ڸ��� & �ٲ�� �� ü������ ���� ���� 
	public static void cut(int x, int y) {
		int cntB = 0, cntW = 0; // �ٲ� ü������ ���� 

		for (int i = x; i < x + 8; ++i) {
			for (int j = y; j < y + 8; ++j) {
				if ((i + j) % 2 == 0) { // ¦�� �ڸ� ����
					if (board[i][j] == 'B') {
						cntW++;
					} else {
						cntB++;
					}
				} else { // Ȧ�� �ڸ� ����
					if (board[i][j] == 'B') {
						cntB++;
					} else {
						cntW++;
					}
				}
			}
		}

		// �ּڰ� ����ϴ� ���� �ٽ�
		min = Math.min(min, cntB); 
		min = Math.min(min, cntW);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		board = new char[N][M];

		for (int i = 0; i < N; ++i) {
			String str = sc.next();
			for (int j = 0; j < str.length(); ++j) {
				board[i][j] = str.charAt(j);
			}
		}

		// 8*8 ũ�� ã��
		for (int i = 0; i < N - 7; i++) {
			for (int j = 0; j < M - 7; j++) {
				cut(i, j);
			}
		}

		System.out.println(min);

	}

}
