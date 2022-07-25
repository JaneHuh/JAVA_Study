package org.java_study.hw2;

import java.util.Scanner;

public class substring_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		for (int i = 0; i <str.length(); i+= 10 ) {
			System.out.println(str.substring(i,i+10) );
			
		}
		
	}
}
