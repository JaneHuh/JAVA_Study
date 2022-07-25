package org.java_study.hw3;

import java.util.Scanner;

public class GoblinLanguage_9226 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		char[] vowel = { 'a', 'e', 'i', 'o', 'u' };

		while (!input.equals("#")) {
			boolean distinguish = false;

			for (int i = 0; i < input.length(); ++i) {
				for (int j = 0; j < vowel.length; ++j) {
					if (input.charAt(i) == vowel[j]) {
						distinguish = true;
						break;
					}
				}
				if (distinguish) {
					input = input.substring(i, input.length()) + input.substring(0, i);
					break;
				}
			}

			System.out.println(input + "ay");
			input = sc.next();
		}
		// string으로 받고 Char arr로 바꾼다
		// charAt(0)이 모음 & char 모음 존재x -> boolean false 저장
		// -> 끝에 ay를 붙인다.
		// while 문을 사용학 # 를 입력받는다면 종료 break;
		/*
		 * boolean distinguish = true;
		 * 
		 * for (int i = 0; i < input.length(); ++i) { for (int j = 0; j < vowel.length;
		 * ++j) { if (input.charAt(0) == vowel[j]) {// 맨앞에 모음 -> 맨끝에 ay를 붙인다.
		 * distinguish = false; break; // 빠져나간다. } else if (input.charAt(i) == vowel[j])
		 * {// 삭제되고 맨뒤로 가기 -> ay를 붙인다. input += input.charAt(i-2); input =
		 * input.substring(i, input.length()); distinguish = false; break; } } if
		 * (distinguish == false) { // 모음이 있으면 빠져나간다. break; } }
		 * 
		 */
	}

}
