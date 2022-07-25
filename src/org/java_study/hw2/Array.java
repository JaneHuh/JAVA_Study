package org.java_study.hw2;

public class Array {

	public static void main(String[] args) {
		System.out.println("매개변수의 개수: " + args.length);
		for(int i=0; i<args.length; i++) {
			System.out.println("args[" + i + "] = \"" + args[i] + "\"");
			//일단 다 문자열로 받는다. 
		}
		
	}

}
