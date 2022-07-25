package org.java_study.hw4;

import java.util.Scanner;

public class RepaintingTheChessboard_1018 {

	static int N, M;
	static char board[][];
	static int min = 64; //8*8크기 체스판에서 바꿀 수 있는 체스판의 최댓값은 64번

	// 8*8크기의 체스판으로 자르기 & 바꿔야 할 체스판의 개수 세기 
	public static void cut(int x, int y) {
		int cntB = 0, cntW = 0; // 바뀐 체스판의 개수 

		for (int i = x; i < x + 8; ++i) {
			for (int j = y; j < y + 8; ++j) {
				if ((i + j) % 2 == 0) { // 짝수 자리 구분
					if (board[i][j] == 'B') {
						cntW++;
					} else {
						cntB++;
					}
				} else { // 홀수 자리 구분
					if (board[i][j] == 'B') {
						cntB++;
					} else {
						cntW++;
					}
				}
			}
		}

		// 최솟값 출력하는 것이 핵심
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

		// 8*8 크기 찾기
		for (int i = 0; i < N - 7; i++) {
			for (int j = 0; j < M - 7; j++) {
				cut(i, j);
			}
		}

		System.out.println(min);

	}

}
