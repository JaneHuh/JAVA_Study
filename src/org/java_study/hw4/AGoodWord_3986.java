package org.java_study.hw4;

import java.util.Scanner;

public class AGoodWord_3986 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int goodWordCount = 0;

		for (int i = 0; i < N; i++) {
			String str = sc.next();
			char[] array = new char[str.length()];
			int count = 0;

			for (int j = 0; j < str.length(); j++) {
				if (count == 0) { // �ʱ�ȭ
					array[count] = str.charAt(j); // ����
					//System.out.println(array[count] + " 0");
					count++;
					//System.out.println(count);

				} else if (array[count - 1] == str.charAt(j)) { // ���� ���� ������ ��
					//System.out.println(array[count - 1] + " same");
					count--; 
					//System.out.println(count);

				} else { // �ٸ� ���� ������ ��
					array[count] = str.charAt(j); // ����
					//System.out.println(array[count] + " differ");
					count++;
					//System.out.println(count);

				}
			}
			if (count == 0) {
				goodWordCount++;
			}
		}
		System.out.println(goodWordCount);
	}

}
