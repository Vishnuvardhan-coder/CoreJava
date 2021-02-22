package com.trinetra;

import java.util.Arrays;
import java.util.Comparator;

class sortByRoll implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {
		return a.getRoolNo() - b.getRoolNo();
	}

}

public class Main {

	public static void main(String[] args) {

		Student[] arr = { new Student(1, "vishnu"), new Student(52, "raju"), new Student(24, "ramu"),
				new Student(121, "sathish") };

		System.out.println("==========un sorted=============");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("===========Sorted============");

		Arrays.sort(arr, new sortByRoll());

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
