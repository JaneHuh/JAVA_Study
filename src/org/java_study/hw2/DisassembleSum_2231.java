package org.java_study.hw2;

import java.util.Scanner;

public class DisassembleSum_2231 { // ������

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int result = 0; // ��������, ������ ������ 0���
		//�������� �����ڰ� ���� ���: 2 10 

		for (int i = 0; i < num; i++) {
			int number = i; // ��������, ���� ���ϹǷ� i �״�� ��� x -> number�� ��Ƽ� ���
			int sum = 0; // ��������, 0���� �ʱ�ȭ

			while (number != 0) {
				// System.out.println("sum: " + sum + " " + number); //Ȯ��
				sum += number % 10; // ������(�� �ڸ��� ��)
				number /= 10; // ��
			}

			if (sum + i == num) { // ������
				result = i;
				break;
			}
		}
		System.out.println(result);

	}

}
