package org.java_study.hw6;

import java.util.Scanner;

public class OrganicCabbage_1012 {
	static int M; // 배추밭의 가로 길이(x)
	static int N; // 배추밭의 세로 길이(y)
	static int K; // 배추가 심어져 있는 위치의 개수
	static int[][] map; // 배추밭
	static boolean[][] visit; // 방문 여부
	static int bug; // 배추흰지렁이 수 세기

	static int[] dx = { 0, 1, 0, -1 }; // x의 상하좌우 이동
	static int[] dy = { -1, 0, 1, 0 }; // y의 상하좌우 이동

	static void dfs(int x, int y) { // Depth-fist Search
		for (int i = 0; i < 4; i++) {
			int rx = x + dx[i];
			int ry = y + dy[i];
			
			if (rx < 0 || ry < 0 || rx >= N || ry >= M) {
				continue;
			}
			if (map[rx][ry] == 1 && visit[rx][ry] == false) {
				visit[rx][ry] = true;
				map[rx][ry] = 0;
				dfs(rx, ry);
			}
		}
		return;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수

		for (int i = 0; i < T; i++) {
			M = sc.nextInt();
			N = sc.nextInt();
			K = sc.nextInt();

			map = new int[N][M];
			visit = new boolean[N][M];
			bug = 0;

			// 배추 위치
			for (int j = 0; j < K; j++) {
				int X = sc.nextInt(); // 가로
				int Y = sc.nextInt(); // 세로
				map[Y][X] = 1;
			}

			// 배추 위치를 찾으면 해당 배추 위치를 시작점으로 dfs
			for (int a = 0; a < N; a++) {
				for (int b = 0; b < M; b++) {
					if (map[a][b] == 1) {
						bug++;
						dfs(a, b);
					}
				}
			}
			System.out.println(bug);
		}

	}

}
