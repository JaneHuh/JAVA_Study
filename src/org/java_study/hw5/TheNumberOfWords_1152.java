package org.java_study.hw5;

import java.util.Scanner;

public class TheNumberOfWords_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().trim(); 
		// trim(): 문자열 앞뒤 공백 제거
		
		System.out.println(str.split(" ").length); 
		// String.split(): 어떤 문자를 기준으로 문자열을 자르고 배열로 리턴 
	}

}
