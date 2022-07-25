package org.java_study.hw5;

import java.util.*;

public class PartialStrings_11478 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		HashSet<String> set = new HashSet<>(); 
		// HashSet: Set 인터페이스에서 지원하는 구현 클래스(Set 성질 상속 받음)
		// 특징: 중복 허용 x, 순서 보장 x, null 값 저장 o
		
		for(int i=0; i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				if(!set.contains(str.substring(i, j))){ // HashSet.contains(): 객체가 존재하는가
					set.add(str.substring(i,j)); // Hashset.add(): 값 추가
				}
			}
		}
		
		System.out.println(set.size()); // HashSet.size(): 크기 구하기 
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
