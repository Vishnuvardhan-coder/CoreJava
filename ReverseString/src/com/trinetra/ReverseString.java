package com.trinetra;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		String str = s.nextLine();//vishnu
		
		String temp = "";
		//char[] ch = str.toCharArray();
		for (int i = str.length()-1 ; i>=0 /*untill zero index position move -1*/ ; i-- /*charcter move -1*/){
			
			temp = temp+str.charAt(i);
		}
		
		System.out.println(temp);
		
		//using method
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		//using recursive method
		
		
		
	}
	

}
