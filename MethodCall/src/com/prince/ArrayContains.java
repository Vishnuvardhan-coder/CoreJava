package com.prince;

public class ArrayContains {

	private static boolean findContains(int[] kadam, int vishnu) {

		boolean b = false;
		for (int i = 0; i < kadam.length; i++) {
			b = (kadam[i] == vishnu) ? true : false;

			if (b) {
				break;
			}

		}
		return b;
	}

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50 };

		System.out.println(findContains(a, 20));

	}

}
