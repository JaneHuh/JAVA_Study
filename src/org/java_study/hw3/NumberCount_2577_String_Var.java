package org.java_study.hw3;

import java.util.Scanner;

public class NumberCount_2577_String_Var {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// �� �� �Է� �ޱ� & �� �� ���ϱ�
		int value = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		
		// �� �ڸ��� ���ϱ� 
		String strValue = Integer.toString(value);

		// 0~9 ���� ���� ����
		for (int i = 0; i < 10; i++) {
			int count = 0; 
			for (int j = 0; j < strValue.length(); j++) {
				if ((strValue.charAt(j) - '0') == i) {
					//System.out.print(strValue.charAt(j)+", ");
					count++;
				}
			}
			// ���
			System.out.println(": "+count);
			
		}
	}

}
