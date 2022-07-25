package org.java_study.hw2;

import java.util.Scanner;

public class ContinuousSection_2495 { // 연속구간

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			String num = sc.next();
			int cnt = 1, max = 1;
			char previous = num.charAt(0);

			for (int j = 1; j < num.length(); j++) {
				char current = num.charAt(j);
				if (previous == current) {
					cnt++;
				} else {
					cnt = 1;
					previous = current;
				}
				max = Math.max(max, cnt);
			}

			System.out.println(max);

		}

	}

}
