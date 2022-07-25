package org.java_study.hw3;

import java.util.Scanner;

public class GoblinLanguage_9226 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		char[] vowel = { 'a', 'e', 'i', 'o', 'u' };

		while (!input.equals("#")) {
			boolean distinguish = false;

			for (int i = 0; i < input.length(); ++i) {
				for (int j = 0; j < vowel.length; ++j) {
					if (input.charAt(i) == vowel[j]) {
						distinguish = true;
						break;
					}
				}
				if (distinguish) {
					input = input.substring(i, input.length()) + input.substring(0, i);
					break;
				}
			}

			System.out.println(input + "ay");
			input = sc.next();
		}
		// string���� �ް� Char arr�� �ٲ۴�
		// charAt(0)�� ���� & char ���� ����x -> boolean false ����
		// -> ���� ay�� ���δ�.
		// while ���� ����� # �� �Է¹޴´ٸ� ���� break;
		/*
		 * boolean distinguish = true;
		 * 
		 * for (int i = 0; i < input.length(); ++i) { for (int j = 0; j < vowel.length;
		 * ++j) { if (input.charAt(0) == vowel[j]) {// �Ǿտ� ���� -> �ǳ��� ay�� ���δ�.
		 * distinguish = false; break; // ����������. } else if (input.charAt(i) == vowel[j])
		 * {// �����ǰ� �ǵڷ� ���� -> ay�� ���δ�. input += input.charAt(i-2); input =
		 * input.substring(i, input.length()); distinguish = false; break; } } if
		 * (distinguish == false) { // ������ ������ ����������. break; } }
		 * 
		 */
	}

}
