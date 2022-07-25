package org.java_study.hw3;

import java.util.Scanner;

public class MakingAnagram_1919 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		String second = sc.next();

		int[] arr = new int[26];

		for (int i = 0; i < first.length(); ++i) {
			arr[first.charAt(i) - 'a']++;
		}

		for (int i = 0; i < second.length(); ++i) {
			arr[second.charAt(i) - 'a']--;
		}
		/* // È®ÀÎ¿ë
		for (int i = 0; i < arr.length; ++i) {
			System.out.println(i + " " + arr[i]);
		}
		*/
		int count = 0;
		for (int i = 0; i < arr.length; ++i) {
			count += Math.abs(arr[i]);
		}
		System.out.println(count);
	}

}
