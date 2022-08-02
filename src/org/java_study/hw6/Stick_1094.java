package org.java_study.hw6;

import java.util.Scanner;

public class Stick_1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int stick = 64;
		int count = 0;

		while (x > 0) {
			if (x < stick) {
				stick /= 2;
			} else {
				x -= stick;
				count++;
			}
		}
		
		System.out.println(count);
	}

}
