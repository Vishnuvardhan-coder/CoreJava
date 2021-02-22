package com.trinetra;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayInReverse {

	public static void main(String[] args) {
		
		Integer[] a = {2,100,6,55,42,98};
		
		Arrays.sort(a, Collections.reverseOrder());
		
		System.out.println(Arrays.toString(a));
	}
}
