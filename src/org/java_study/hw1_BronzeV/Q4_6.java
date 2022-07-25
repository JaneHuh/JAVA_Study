package org.java_study.hw1_BronzeV;

public class Q4_6 {

	public static void main(String[] args) {
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if ( i + j == 6) {
					System.out.println(i + "+" + j + "=" + (i + j));
				}
			}
		}
		
		/*int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < 6; ++i) {
			for (int j = 0; j < 6; ++i) {
				if (arr1[i] + arr2[j] == 6) {
					System.out.println(i + " " + j);
				}
			}
		}*/

	}

}
