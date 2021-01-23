package com.trinetra;

import java.util.Scanner;

public class BothStringsSameOrNot {

	public static void main(String[] args) {

		String s2 = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First String");

		String s1 = sc.nextLine();
		System.out.println("Enter Secound String");
		String str = sc.nextLine();

		for (int i = 0, j = 0; i < str.length() && j < s1.length(); i++, j++) {

			if (str.charAt(i) == (s1.charAt(j))) {

				s2 = s2 + s1.charAt(i);

			}

		}
		if (s1.equals(s2)) {
			System.out.println("Both Strings Are Same");
		} else {
			System.out.println("Both Are Not Same");
		}

	}

}
