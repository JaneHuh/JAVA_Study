package org.java_study.hw1_BronzeV;

import java.util.Arrays;
import java.util.Scanner;

public class Attendance_5597_sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] attendancenum = new int[10];

		for (int i = 0; i < attendancenum.length - 2; i++) {
			int num = sc.nextInt();
			attendancenum[num - 1] = 1;
		}

		Arrays.sort(attendancenum);

		for (int i = 0; i < attendancenum.length; i++) {
			// if (attendancenum[i] != 1) {
			System.out.println(attendancenum[i]);
		}
		
		//sort �̿� -> ���� 2�� ������ �� ����ϸ� ���� ���� ����� �� ����
	}

}
