package org.java_study.hw7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MazeNavigation_2178 {
	static int[][] maze;
	static boolean[][] visited;
	static int N, M;
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		maze = new int[N][M];
		visited = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			String tmp = sc.next();
			for (int j = 0; j < M; j++) {
				maze[i][j] = tmp.charAt(j) - '0';
			}
		}
		bfs();
		System.out.println(maze[N - 1][M - 1]);
	}

	private static void bfs() {
		Queue<Integer> queue_x = new LinkedList<>();
		Queue<Integer> queue_y = new LinkedList<>();

		queue_x.offer(0);
		queue_y.offer(0);

		visited[0][0] = true;

		while (!queue_x.isEmpty()) {
			int x = queue_x.poll();
			int y = queue_y.poll();

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
					if (maze[nx][ny] == 1 && !visited[nx][ny]) {
						queue_x.offer(nx);
						queue_y.offer(ny);

						visited[nx][ny] = true;

						maze[nx][ny] = maze[x][y] + 1;
					}
				}
			}
		}
	}
}
