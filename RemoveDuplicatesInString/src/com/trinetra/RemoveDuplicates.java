package com.trinetra;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String s = "abcabc";
		
	char[] ch = s.toCharArray();
	
	Set<Character> s1 = new HashSet<>();
	
	for(char c : ch) {
	s1.add(c);
	}
	System.out.println(s1);
	}
}
