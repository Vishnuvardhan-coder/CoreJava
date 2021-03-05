package com.trinetra;

public class LeetCodeStringReverse {

	public static void main(String[] args) {

		char ch[] = { 'h', 'e', 'l', 'l', 'o' };
	
		System.out.println(reverseString(ch));
	}

	public static String reverseString(char[] s) {
		     
		int i =0;
		int j = s.length-1;
		while(i<j) {
			char temp = s[i];
			s[i++]=s[j];
			s[j--]=temp;
		}
		return String.valueOf(s);	
	}
	
}
