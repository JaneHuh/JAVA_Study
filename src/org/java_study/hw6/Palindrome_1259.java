package org.java_study.hw6;

import java.util.Scanner;

public class Palindrome_1259 {	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		
		while (!(input = sc.next()).equals("0")) {
			boolean result = false; 
			
			for (var i = 0; i < input.length() / 2; i++)
				if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
					result = true; 
					break; 
				}

			if (result)	System.out.println("no"); 
			else System.out.println("yes"); 
		}

	}

}
