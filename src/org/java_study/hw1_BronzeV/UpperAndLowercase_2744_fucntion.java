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
		
		// 문자열을 바로 치환하는 것은 불가 
		// 대소문자 변환, 아스키코드값 128가지의 표현이 가능하다
		// 대소문자 확인하는 함수? -> Charcter.isUpperCase(), isDigit(), isLowerCase() -> boolean형임!!
		//대소문자를 바꿔주는 문자 str.toLowerCase(),  str.toUpperCase()
	}

}
