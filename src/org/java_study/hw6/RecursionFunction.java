package org.java_study.hw6;

public class RecursionFunction { // ����Լ� ("HelloWrold" 5�� ����ϱ�)

	public static void main(String[] args) { 
		printHelloWorld(5); // printHelloWorld1();
	}

	// 3
	static void printHelloWorld(int n) {
		if (n == 0)	return; // ���� ����
		System.out.println("HelloWorld"); 
		printHelloWorld(n - 1); 
		// ����Լ��� ���������� �ݵ�� �ʿ��ϴ�. 
	}

	/* // 1
	 * static void printHelloWorld1(int x) {
	 * 		for (int i = 0; i < x; ++i) { 
	 * 			System.out.println("HelloWorld"); // 5���� ����
	 * 		}
	 * }
	 */
	
	/* // 2
	 * static void printHelloWorld2() { 
	 * 		System.out.println("HelloWorld");
	 * 		printHelloWorld2(); // �޼��� �ȿ� �޼��尡 ����ִ� ���� ����Լ��� ��. 
	 * 		// ���� �ݺ�.. -> 5���� �����Ű�� �ʹٸ�? ���������� �־������. 
	 * }
	 */

}
