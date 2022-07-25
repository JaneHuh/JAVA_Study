package org.java_study.hw2;

import java.util.Scanner;

public class BanStudingAbroad_2789_Boolean {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		char[] arr1 = { 'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E' };
		char[] arr2 = input.toCharArray();

		for (int i = 0; i < arr2.length; i++) {
			boolean a = true;
			for (int j = 0; j < arr1.length; j++) {
				if (arr2[i] == arr1[j]) {
					a = false;
					// continue; //System.out.print(arr2[i]);
				}

			}
			if (a == true) {
				System.out.print(arr2[i]);
			}

		}
	}

}
