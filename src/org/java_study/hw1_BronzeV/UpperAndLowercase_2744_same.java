package org.java_study.hw1_BronzeV;

import java.util.Scanner;

public class UpperAndLowercase_2744_same {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input1 = sc.next();
		String input2 = sc.next();
		char[] word1 = input1.toCharArray();
		char[] word2 = input2.toCharArray();

		if(input1.equalsIgnoreCase(input2)) { //1. �Լ����
			System.out.println("����");
		}
		else {
			System.out.println("�ٸ���");
		}
		
		//2. �� �빮�ڷ� ��ȯ 
		//for (int i = 0; i < input1.length(); i++) {
		//	if (Character.isUppercase(word[i]):) { 
		//		word1[i] -= 32;
		//	} 
		//}


		// ���ڿ��� �ٷ� ġȯ�ϴ� ���� �Ұ�
		// ��ҹ��� ��ȯ, �ƽ�Ű�ڵ尪 128������ ǥ���� �����ϴ�
		// ��ҹ��� Ȯ���ϴ� �Լ�? -> isUpperCase(), isDigit(), isLowerCase()

		// ��ҹ��ڸ� �ٲ��ִ� ���� str.toLowerCase(), str.toUpperCase()
	}

}
