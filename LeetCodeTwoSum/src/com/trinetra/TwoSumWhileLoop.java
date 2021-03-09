package com.trinetra;

public class TwoSumWhileLoop {

	public static void main(String[] args) {

		int a[] = { 3, 2, 4 };
		int value = 6;
		int b[] = findSum(a, value);
		for (int val : b) {
			System.out.print(val + " ");
		}

	}

	private static int[] findSum(int[] a, int value) {

		int i = 0, j = 0;

		while (i <= a.length - 1 && j <= a.length - 1) {

			if (i != j && a[i] + a[j] == value) {
				return new int[] { i, j };
			}
			j++;
			if (j == a.length - 1) {
				i++;
				j = 0;
			}
		}
		return new int[] {};
	}

}
