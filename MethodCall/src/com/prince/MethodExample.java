package com.prince;

public class MethodExample {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println(findCount(a, b));

	}

	private static int findCount(int a, int b) {

		int sum = a + b;
		return sum;
	}
}
