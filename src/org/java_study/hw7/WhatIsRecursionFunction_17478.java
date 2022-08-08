package org.java_study.hw7;

import java.util.Scanner;

public class WhatIsRecursionFunction_17478 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		printChatbotResponse(num);

	}

	static String underscore = ""; // static �޼��忡���� �ν��Ͻ� ������ ����� �� ����.

	static void printChatbotResponse(int n) {
		String line = underscore;
		System.out.println(line + "\"����Լ��� ������?\"");
		
		if (n == 0) { // ���� ����
			System.out.println(line + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			System.out.println(line + "��� �亯�Ͽ���.");
			return;
		}

		System.out.println(line + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
		System.out.println(line + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
		System.out.println(line + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
		
		underscore += "____";
		printChatbotResponse(n - 1);
		System.out.println(line + "��� �亯�Ͽ���.");
	}
}
