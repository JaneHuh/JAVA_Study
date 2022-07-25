package org.java_study.hw3;

import java.util.Scanner;

public class NumberCount_2577_String_Var {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 세 수 입력 받기 & 세 수 곱하기
		int value = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		
		// 각 자릿수 구하기 
		String strValue = Integer.toString(value);

		// 0~9 숫자 개수 세기
		for (int i = 0; i < 10; i++) {
			int count = 0; 
			for (int j = 0; j < strValue.length(); j++) {
				if ((strValue.charAt(j) - '0') == i) {
					//System.out.print(strValue.charAt(j)+", ");
					count++;
				}
			}
			// 출력
			System.out.println(": "+count);
			
		}
	}

}
