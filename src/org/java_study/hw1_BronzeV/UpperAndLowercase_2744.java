package org.java_study.hw1_BronzeV;

import java.util.Scanner;

public class UpperAndLowercase_2744 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		char[] word = input.toCharArray();

		for (int i = 0; i < input.length(); i++) {
			if (word[i] >= 'a' && word[i] <= 'z') { // Character.isUppercase(word[i]): ���� �� �������̰�, �����
				word[i] -= 32; //ASCII code
			} else if (word[i] >= 'A' && word[i] <= 'Z') {
				word[i] += 32;
			}
		}

		System.out.println(word);
		
		// ���ڿ��� �ٷ� ġȯ�ϴ� ���� �Ұ� 
		// ��ҹ��� ��ȯ, �ƽ�Ű�ڵ尪 128������ ǥ���� �����ϴ�
		// ��ҹ��� Ȯ���ϴ� �Լ�? -> isUpperCase(), isDigit(), isLowerCase()
		
		//��ҹ��ڸ� �ٲ��ִ� ���� str.toLowerCase(),  str.toUpperCase()
	}

}
