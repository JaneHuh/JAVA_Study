package org.java_study.hw1_BronzeV;

public class Q4_4 {

	public static void main(String[] args) {
		int sum = 0; 
		int s = 1;
		int num = 0;
		
		for (int i = 1; sum < 100; i++, s=-s) { // i, s 같이 쓸 수 있음!! s의 값은 1, -1, 1, -1, 1..
			num = s * i;
			sum += num;
		}
		
		System.out.println(num);
		System.out.println(sum);
		
		/*int i = 1;
		int sum = 0;

		while (sum < 100) {
			if (i % 2 == 0) {
				i = -i;
			}
			sum += i;
			i = +i + 2;
			++i;
		}
		System.out.println(i);
		System.out.println(sum);*/
		
	}

}
