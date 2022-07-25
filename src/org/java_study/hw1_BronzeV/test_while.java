package org.java_study.hw1_BronzeV;

public class test_while {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while( sum<100) {
		
			System.out.println(i + " - "+ sum);
			sum += ++i;
		}
	}
}
