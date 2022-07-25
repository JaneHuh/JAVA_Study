package org.java_study.hw1_BronzeV;

public class Q4_3 {
	public static void main(String[] args) {
		int sum = 0;
		int totalSum = 0; // À¯ÀÇ!!
		
		for (int i = 1; i < 11; ++i) {
			sum += i;
			totalSum += sum;
		}
		System.out.println( totalSum );
		
		/*int sum = 0;
		for (int i = 1; i<11; ++i) {
			sum += i;
			System.out.println(sum );
		}*/
		
	}
}
