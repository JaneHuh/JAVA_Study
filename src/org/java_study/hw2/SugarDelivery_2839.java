package org.java_study.hw2;

import java.util.Scanner;

public class SugarDelivery_2839 { // 설탕배달

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sugar = sc.nextInt();

		int cnt = 0;

		while (true) {
			if (sugar % 5 == 0) {
				System.out.println((sugar / 5) + cnt);
				break;
			} else if (sugar < 0) {
				System.out.println("-1");
				break;
			}
			sugar -= 3;
			cnt++;
		}
		
		

		/*
		 * while (true) { 
		 * if(suger%5 ==0) { 
		 * 	cnt += suger / 5; 
		 * 	System.out.println(cnt);
		 * 	break; 
		 * } else { 
		 * 	suger -= 3; 
		 * 	cnt++; 
		 * } if (suger < 0) {
		 * 	System.out.println("-1"); 
		 * 	break; } }
		 */

		/*
		 * if (suger == 4 || suger == 7) { System.out.println(-1); } else if (suger % 5
		 * == 0) { System.out.println(suger / 5); } else if (suger % 5 == 1 || suger % 5
		 * == 3) { System.out.println((suger / 5) + 1); } else if (suger % 5 == 2 ||
		 * suger % 5 == 4) { System.out.println((suger / 5) + 2); }
		 */

		/*
		 * int[] arr1 = { 3, 5 }; int[] arr2 = { 5, 3 }; // 3, 5 순서에 따라 효율성 증감 int n1 =
		 * 0, n2 = 0;
		 * 
		 * 
		 * 
		 * 
		 * for (int i = 0; i < arr1.length; i++) { n1 = suger / arr1[i]; suger = suger %
		 * arr1[i];
		 * 
		 * System.out.println(arr1[i] + "g " + n1 + "장" + suger);
		 * 
		 * // n2 = n2 + n1; if (arr1[i] == 5 && suger % 3 != 0) {
		 * System.out.println(arr1[i] +"g " + n2 + "장"); System.out.println("-1"); } //
		 * else { System.out.println(n2); }
		 * 
		 * 
		 * }
		 */

		// else {
		// System.out.println(arr[i] +"g " + n1 + "장");
		// }*/

	}

}
