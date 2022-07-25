package org.java_study.hw1_BronzeV;

import java.util.Scanner;

public class UpperAndLowercase_2744_fucntion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.next(); 
		char[] word = input.toCharArray(); //String -> char array

		for (int i = 0; i < input.length(); i++) {
			if (Character.isUpperCase(word[i])) { // Character.isUppercase(word[i]): more intuitive, exclusive
												  //keep in mind that "Character.isUpperCase" is boolean type
				word[i] = input.toLowerCase().charAt(i); //str.toLowerCase only use String type, not char type
														 //receive String and change that to char / important: charAt(i) 
			} else if (Character.isLowerCase(word[i])) {
				word[i] = input.toUpperCase().charAt(i);
			}
		}

		System.out.println(word);
		
		// ���ڿ��� �ٷ� ġȯ�ϴ� ���� �Ұ� 
		// ��ҹ��� ��ȯ, �ƽ�Ű�ڵ尪 128������ ǥ���� �����ϴ�
		// ��ҹ��� Ȯ���ϴ� �Լ�? -> Charcter.isUpperCase(), isDigit(), isLowerCase() -> boolean����!!
		//��ҹ��ڸ� �ٲ��ִ� ���� str.toLowerCase(),  str.toUpperCase()
	}

}
