package org.java_study.hw7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JosephusQuestion0_11866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		
		for (int i = 0; i < N; i++) {
			q.add(i+1);
		}

		int cnt = 0;
		while (!q.isEmpty()) {
			cnt++;
			int tmp = q.poll();
			if (cnt % K == 0)
				list.add(tmp);
			else
				q.add(tmp);
		}

		System.out.println(list.toString().replace("[", "<").replace("]", ">"));
	}

}
