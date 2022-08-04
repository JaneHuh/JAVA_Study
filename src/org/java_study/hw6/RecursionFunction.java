package org.java_study.hw6;

public class RecursionFunction { // 재귀함수 ("HelloWrold" 5번 출력하기)

	public static void main(String[] args) { 
		printHelloWorld(5); // printHelloWorld1();
	}

	// 3
	static void printHelloWorld(int n) {
		if (n == 0)	return; // 종료 조건
		System.out.println("HelloWorld"); 
		printHelloWorld(n - 1); 
		// 재귀함수는 종료조건이 반드시 필요하다. 
	}

	/* // 1
	 * static void printHelloWorld1(int x) {
	 * 		for (int i = 0; i < x; ++i) { 
	 * 			System.out.println("HelloWorld"); // 5번만 실행
	 * 		}
	 * }
	 */
	
	/* // 2
	 * static void printHelloWorld2() { 
	 * 		System.out.println("HelloWorld");
	 * 		printHelloWorld2(); // 메서드 안에 메서드가 들어있는 것을 재귀함수라 함. 
	 * 		// 무한 반복.. -> 5번만 실행시키고 싶다면? 종료조건을 넣어줘야함. 
	 * }
	 */

}
