package org.java_study.hw5;

import java.util.Scanner;

public class TheNumberOfWords_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().trim(); 
		// trim(): ���ڿ� �յ� ���� ����
		
		System.out.println(str.split(" ").length); 
		// String.split(): � ���ڸ� �������� ���ڿ��� �ڸ��� �迭�� ���� 
	}

}
