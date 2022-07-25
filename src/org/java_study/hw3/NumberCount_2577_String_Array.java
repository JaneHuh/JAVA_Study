package org.java_study.hw3;

import java.util.Scanner;

public class NumberCount_2577_String_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 세 수 입력 받기
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// 세 수 곱하기 & 각 자릿수 구하기
		String strValue = Integer.toString(a * b * c);

		// 0~9 숫자 개수 세기
		int[] count = new int[10]; 

		for (int i = 0; i < strValue.length(); i++) {
			count[strValue.charAt(i) - '0']++;
			//System.out.print(strValue.charAt(i)+", ");
		}
		
		// 출력
		//System.out.println();
		for (int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}

	}

}
