package com.trinetra;

import java.util.Arrays;

public class ArrayHigestNumber {

	public static void main(String[] args) {

		int a[] = { 11, 89 , 32 , 25 , 42 , 2 , 7, 24 };
		Arrays.sort(a);
		int largest = a[a.length-1]; //length = 8 but we want index of a[i] so -1
		System.out.println(largest);
	}

}
