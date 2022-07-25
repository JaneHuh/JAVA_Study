package org.java_study.hw1_BronzeV;

public class Q4_2 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0 && i % 3 != 0) // 왜 ||가 아니고 &&???
				sum += i;
		}
		
		System.out.println(sum);
		
		/*int i = 1; 
		int sum = 0; 
		  
		while (i <= 20) {
			if (i % 2 != 0 || i % 3 != 0){ 
				sum += i; 
			} 
			++i; 
		} 
		System.out.println(sum);*/
		  
	}

}
