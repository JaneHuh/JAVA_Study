package org.java_study.hw1_BronzeV;

import java.util.Scanner;

public class Attendance_5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] attendancenum = new int[10];

		for (int i = 0; i < attendancenum.length - 2; i++) {
			int num = sc.nextInt();
			attendancenum[num - 1] = 1;
		}

		for (int i = 0; i < attendancenum.length; i++) {
			if (attendancenum[i] != 1) {
				System.out.println(i + 1);
			}

		}

	}

}
