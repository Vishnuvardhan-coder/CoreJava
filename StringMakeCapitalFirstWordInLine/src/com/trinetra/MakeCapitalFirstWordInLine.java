package com.trinetra;

import java.util.Scanner;

public class MakeCapitalFirstWordInLine {
	public static void main(String[] args) {
		// create object of scanner class.
		Scanner sc = new Scanner(System.in);

		// enter sentence here
		System.out.print("Enter sentence here : ");
		String s = sc.nextLine();
		String uc = "";

		// this is for the new line which is generated after conversion.
		Scanner lineScan = new Scanner(s);
		while (lineScan.hasNext()) {
			String word = lineScan.next();
			uc += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
		}

		// print original line with output.
		System.out.println("Original sentence is : " + s);
		System.out.println("Sentence after convert : " + uc.trim());
	}
}