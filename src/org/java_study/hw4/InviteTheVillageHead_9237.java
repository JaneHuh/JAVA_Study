package org.java_study.hw4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class InviteTheVillageHead_9237 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int maxDay = 0;
		Integer tree[] = new Integer[N]; // Collections.reverseOrder()

		for (int i = 0; i < N; i++) {
			tree[i] = sc.nextInt();
		}

		Arrays.sort(tree, Collections.reverseOrder()); // ���� �ɸ��� �ź���

		for (int i = 0; i < N; i++) {
			maxDay = Math.max(maxDay, tree[i] + i + 1); // �ڶ�� �ð� + ��ĥ �����°� + �ɴ� �ð� 
		}

		maxDay++; // �� �ڶ� ������ ����� �ʴ� 
		System.out.println(maxDay);
	}

}
