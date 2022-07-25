package org.java_study.hw2;

import java.util.Scanner;

public class dd_2920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8 };
		
		
		int[] arr2 = new int[7];
		
		for(int i = 0; i<arr1.length; ++i) {
			arr2[i] = sc.nextInt();
			
		}
		
		for(int i = 0; i<arr1.length; ++i) {
			arr2[i] = sc.nextInt();
			if (arr1[i] == arr2[i]) {
				System.out.println("asc");
			}
			else if (arr1[arr1.length-i] == arr2[i]) {
				System.out.println("desc");
			}
			else {
				System.out.println("mixed");
			}
			
		}
		//끝까지 계속 작으면.. 끝까지 계속 커지면...
		
	}

}
