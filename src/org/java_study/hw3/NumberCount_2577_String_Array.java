package org.java_study.hw3;

import java.util.Scanner;

public class NumberCount_2577_String_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// �� �� �Է� �ޱ�
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// �� �� ���ϱ� & �� �ڸ��� ���ϱ�
		String strValue = Integer.toString(a * b * c);

		// 0~9 ���� ���� ����
		int[] count = new int[10]; 

		for (int i = 0; i < strValue.length(); i++) {
			count[strValue.charAt(i) - '0']++;
			//System.out.print(strValue.charAt(i)+", ");
		}
		
		// ���
		//System.out.println();
		for (int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}

	}

}