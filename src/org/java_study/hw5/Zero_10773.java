package org.java_study.hw5;

import java.util.Scanner;
import java.util.Stack;
 
public class Zero_10773 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		
		int K = sc.nextInt();
		int sum = 0;

		for (int i = 0; i < K; ++i) {
			int num = sc.nextInt();
			if (num == 0) stack.pop(); // stack.pop(): stack top ����
			else stack.push(num); // stack.push(): stack ���� �߰�
		}

		while(!stack.isEmpty()) {
			sum += stack.pop();
		}

		System.out.println(sum);
	}

}
