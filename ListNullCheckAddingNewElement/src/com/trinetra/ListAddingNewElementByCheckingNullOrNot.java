package com.trinetra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAddingNewElementByCheckingNullOrNot {

	public static void main(String[] args) {

		List<Integer> a = new ArrayList( Arrays.asList(1, 2));
           int b = 3;
		System.out.println(fundQuantity(a, b));
		System.out.println(a);

	}

	private static boolean fundQuantity(List<Integer> a, Integer b) {

		return (a != null && b != null) ? a.add(b) : false;
	}

}
