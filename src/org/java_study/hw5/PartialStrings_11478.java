package org.java_study.hw5;

import java.util.*;

public class PartialStrings_11478 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		HashSet<String> set = new HashSet<>(); 
		// HashSet: Set �������̽����� �����ϴ� ���� Ŭ����(Set ���� ��� ����)
		// Ư¡: �ߺ� ��� x, ���� ���� x, null �� ���� o
		
		for(int i=0; i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				if(!set.contains(str.substring(i, j))){ // HashSet.contains(): ��ü�� �����ϴ°�
					set.add(str.substring(i,j)); // Hashset.add(): �� �߰�
				}
			}
		}
		
		System.out.println(set.size()); // HashSet.size(): ũ�� ���ϱ� 
		//System.out.println(set);
		
		
		
		
		
		
		
		/*
		 * int count = 0;
		 * for (int i = str.length() - 1; i >= 0; i--) {
			for (int j = i; j < str.length(); j++) {
				String temp1 = str.substring(i + 1);
				System.out.println("temp1 " + str.substring(i + 1));
				String temp2 = str.substring(i, j + 1);
				System.out.println(str.substring(i, j + 1));
				if (temp1.contains(temp2)) {
					continue;
				} else {
					count++;
					System.out.println(count);
				}
			}
		}
		System.out.println(count);*/
	

		

	}

}
