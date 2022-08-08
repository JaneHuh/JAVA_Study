package org.java_study.hw7;

import java.util.Scanner;
import java.util.Stack;

public class BalancedWorld_4949 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;

		while (!(input = sc.nextLine()).equals(".")) { // nextLine()
			System.out.println(checkBalance(input));
		}
	}

	public static String checkBalance(String input) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == '(' || ch == '[') {
				stack.push(ch);
			} else if (ch == ')' || ch == ']') {
				if (stack.isEmpty() || (ch == ')' && stack.peek() != '(') 
								  || (ch == ']' && stack.peek() != '[')) {
					return "no";
				} else {
					stack.pop();
				}
			}
		}

		if (stack.isEmpty()) {
			return "yes";
		} else {
			return "no";
		}
	}
}
