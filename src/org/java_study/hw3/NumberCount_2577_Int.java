package org.java_study.hw3;

import java.util.Scanner;

public class NumberCount_2577_Int {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// �� �� �Է� �ޱ�
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// �� �� ���ϱ� & �� �ڸ��� ���ϱ�
		int intValue = a * b * c;

		// 0~9 ���� ���� ����
		int[] count = new int[10]; 

		while (intValue > 0) {
			//System.out.println(intValue);
			count[intValue % 10] += 1; // intValue % 10: �� �� �ڸ��� (������)
			//System.out.println(intValue % 10 + "�� ���� " + count[intValue % 10]);
			intValue /= 10; // ��
		}

		// ���
		for (int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}

	}

}
