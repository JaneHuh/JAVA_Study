package org.java_study.hw6;

import java.util.Scanner;

public class OrganicCabbage_1012 {
	static int M; // ���߹��� ���� ����(x)
	static int N; // ���߹��� ���� ����(y)
	static int K; // ���߰� �ɾ��� �ִ� ��ġ�� ����
	static int[][] map; // ���߹�
	static boolean[][] visit; // �湮 ����
	static int bug; // ������������ �� ����

	static int[] dx = { 0, 1, 0, -1 }; // x�� �����¿� �̵�
	static int[] dy = { -1, 0, 1, 0 }; // y�� �����¿� �̵�

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
		int T = sc.nextInt(); // �׽�Ʈ ���̽��� ����

		for (int i = 0; i < T; i++) {
			M = sc.nextInt();
			N = sc.nextInt();
			K = sc.nextInt();

			map = new int[N][M];
			visit = new boolean[N][M];
			bug = 0;

			// ���� ��ġ
			for (int j = 0; j < K; j++) {
				int X = sc.nextInt(); // ����
				int Y = sc.nextInt(); // ����
				map[Y][X] = 1;
			}

			// ���� ��ġ�� ã���� �ش� ���� ��ġ�� ���������� dfs
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
