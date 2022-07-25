package org.java_study.hw2;

import java.util.Arrays;

public class Random {

	public static void main(String[] args) {
		int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for(int i = 0; i<9; i++){
			int n = (int)(Math.random()*10);
			int temp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = temp;
			
		}
		System.out.println(Arrays.toString(numArr));
		
		
		
	}

}
