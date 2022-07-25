package org.java_study.hw4;

import java.util.Scanner;

public class ILoveCroatia_9517 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int N = sc.nextInt();

		int time = 0;

		for (int i = 0; i < N; ++i) {
			int T = sc.nextInt();
			String Z = sc.next();

			time += T;
			if (time >= 210) continue;
			if (Z.equals("T")) K++;
			if (K == 9)	K = 1;
		}
		System.out.println(K);

	}

}
