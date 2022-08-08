package org.java_study.hw7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Unreliableness_1764 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < N; i++) {
			set.add(sc.next());
		}
		
		ArrayList<String> result = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			String tmp = sc.next();
			if(set.contains(tmp)) {
				result.add(tmp);
			}
		}

		Collections.sort(result);

		// print result
		System.out.println(result.size());
		for (String s : result) {
			System.out.println(s);
		}
	}

}
