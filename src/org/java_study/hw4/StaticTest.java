package org.java_study.hw4;

class StaticTest {
	static int width = 200;			// Ŭ���� ����(static����)
	static int height = 120;		// Ŭ���� ����(static����)
	
	static {						// Ŭ���� �ʱ�ȭ ��: �޸𸮿� �ε��� ��, ���� ���� ���� & �ѹ��� ����
		// static ������ ������ �ʱ�ȭ ����
	}
	
	static int max(int a, int b) {	// Ŭ���� �޼���(static�޼���)
		return a > b ? a : b;
	}
}
