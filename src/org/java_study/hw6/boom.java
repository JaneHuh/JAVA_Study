package org.java_study.hw6;

public class boom { // 10 9 8 .. 1 ³ª¿­ÇÏ°í "»½" Ãâ·ÂÇÏ±â

	public static void main(String[] args) {
		boom(10);
	}

	public static void boom(int n) {
		if (n == 0) {
			System.out.println("»½");
			return;
		} 
		System.out.println(n);
		boom(n - 1); 

	}

}
