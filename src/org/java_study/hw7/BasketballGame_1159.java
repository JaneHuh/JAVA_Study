package org.java_study.hw7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BasketballGame_1159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] alpha = new int[26];
		ArrayList<Character> list = new ArrayList<>();

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String lastName = sc.next();
			alpha[lastName.charAt(0) - 'a']++;

			if (alpha[lastName.charAt(0) - 'a'] >= 5 &&
				!list.contains((char) (lastName.charAt(0)))) {
				list.add((char) (lastName.charAt(0)));
			}
		}

		if (list.size() == 0) {
			System.out.print("PREDAJA");
		} else {
			Collections.sort(list);
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i));
			}
		}
	}

}
