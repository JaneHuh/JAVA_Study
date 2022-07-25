package org.java_study.hw1_BronzeV;

import java.util.Scanner;

public class UpperAndLowercase_2744 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		char[] word = input.toCharArray();

		for (int i = 0; i < input.length(); i++) {
			if (word[i] >= 'a' && word[i] <= 'z') { // Character.isUppercase(word[i]): 조금 더 직관적이고, 고급짐
				word[i] -= 32; //ASCII code
			} else if (word[i] >= 'A' && word[i] <= 'Z') {
				word[i] += 32;
			}
		}

		System.out.println(word);
		
		// 문자열을 바로 치환하는 것은 불가 
		// 대소문자 변환, 아스키코드값 128가지의 표현이 가능하다
		// 대소문자 확인하는 함수? -> isUpperCase(), isDigit(), isLowerCase()
		
		//대소문자를 바꿔주는 문자 str.toLowerCase(),  str.toUpperCase()
	}

}
