package com.trinetra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateStringUsingJava8 {

	public static void main(String[] args) {
		
		String s = "abcabc";
		
		List<String> alist = new ArrayList(Arrays.asList(s.split("")));//it will add string chars to list objects
		
		List<String> collect = alist.stream().distinct().collect(Collectors.toList());
		
		System.out.println(collect);
		
		
		
	}
}
