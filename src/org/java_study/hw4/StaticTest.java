package org.java_study.hw4;

class StaticTest {
	static int width = 200;			// 클래스 변수(static변수)
	static int height = 120;		// 클래스 변수(static변수)
	
	static {						// 클래스 초기화 블럭: 메모리에 로딩될 때, 가장 먼저 수행 & 한번만 수행
		// static 변수의 복잡한 초기화 수행
	}
	
	static int max(int a, int b) {	// 클래스 메서드(static메서드)
		return a > b ? a : b;
	}
}
