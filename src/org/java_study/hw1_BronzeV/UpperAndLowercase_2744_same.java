package org.java_study.hw1_BronzeV;

import java.util.Scanner;

public class UpperAndLowercase_2744_same {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input1 = sc.next();
		String input2 = sc.next();
		char[] word1 = input1.toCharArray();
		char[] word2 = input2.toCharArray();

		if(input1.equalsIgnoreCase(input2)) { //1. 함수사용
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		//2. 다 대문자로 변환 
		//for (int i = 0; i < input1.length(); i++) {
		//	if (Character.isUppercase(word[i]):) { 
		//		word1[i] -= 32;
		//	} 
		//}


		// 문자열을 바로 치환하는 것은 불가
		// 대소문자 변환, 아스키코드값 128가지의 표현이 가능하다
		// 대소문자 확인하는 함수? -> isUpperCase(), isDigit(), isLowerCase()

		// 대소문자를 바꿔주는 문자 str.toLowerCase(), str.toUpperCase()
	}

}
