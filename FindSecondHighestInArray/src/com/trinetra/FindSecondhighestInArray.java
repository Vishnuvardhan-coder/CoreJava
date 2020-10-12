package com.trinetra;

public class FindSecondhighestInArray {

	public static void main(String[] args) {

		int arr[] = { 10, 30, 20, 60, 50 };

		int temp;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		System.out.println("second largest number is :" +arr[1]);
	}
}
