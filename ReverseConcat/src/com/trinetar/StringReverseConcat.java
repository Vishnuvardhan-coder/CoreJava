package com.trinetar;

import java.util.Scanner;

public class StringReverseConcat {

	public static void main(String[] args) {

		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Enter a Number :");

		int n = sc.nextInt();
		char a[] = s.toCharArray();

		for (int j = 0; j < n; j++) {
			char temp = a[a.length - 1];

			for (int i = 1; i < a.length; i++) {
				a[a.length - i] = a[a.length - (i + 1)];
			}
			a[0] = temp;
		}
		System.out.println("Output String is: ");

		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
	}
}
