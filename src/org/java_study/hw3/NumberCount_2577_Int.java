package org.java_study.hw3;

import java.util.Scanner;

public class NumberCount_2577_Int {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 세 수 입력 받기
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// 세 수 곱하기 & 각 자릿수 구하기
		int intValue = a * b * c;

		// 0~9 숫자 개수 세기
		int[] count = new int[10]; 

		while (intValue > 0) {
			//System.out.println(intValue);
			count[intValue % 10] += 1; // intValue % 10: 각 끝 자릿수 (나머지)
			//System.out.println(intValue % 10 + "의 개수 " + count[intValue % 10]);
			intValue /= 10; // 몫
		}

		// 출력
		for (int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}

	}

}
