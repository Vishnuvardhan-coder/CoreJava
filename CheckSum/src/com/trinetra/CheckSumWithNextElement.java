package com.trinetra;

public class CheckSumWithNextElement {

	public static void main(String[] args) {

		int[] a = { 1, 3, 2, 5, 29, 6, 8 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				int sum = a[i] + a[j];
				for (int k = 0; k < a.length; k++) {
					if (a[k]==sum) {
						System.out.println(a[i] + " " + a[j]);
					}
				}
			}
		}
	}

}
