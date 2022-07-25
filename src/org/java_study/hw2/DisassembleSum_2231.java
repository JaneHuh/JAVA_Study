package org.java_study.hw2;

import java.util.Scanner;

public class DisassembleSum_2231 { // 분해합

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int result = 0; // 전역변수, 생성자 없으면 0출력
		//분해합의 생성자가 없는 경우: 2 10 

		for (int i = 0; i < num; i++) {
			int number = i; // 지역변수, 값이 변하므로 i 그대로 사용 x -> number에 담아서 사용
			int sum = 0; // 지역변수, 0으로 초기화

			while (number != 0) {
				// System.out.println("sum: " + sum + " " + number); //확인
				sum += number % 10; // 나머지(각 자리수 합)
				number /= 10; // 몫
			}

			if (sum + i == num) { // 생성자
				result = i;
				break;
			}
		}
		System.out.println(result);

	}

}
