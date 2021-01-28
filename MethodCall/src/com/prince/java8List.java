package com.prince;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class java8List {

	public static void main(String[] args) {
		
		List<Integer> alist = new ArrayList<>();
		
		alist.add(2);
		alist.add(3);
		alist.add(4);
		alist.add(5);
		
		/*
		 * for(Integer a : alist) {
		 * 
		 * if(a%2==0) { System.out.println(a); } }
		 */	
		List<Integer> collect = alist.stream().filter(o->o%2==0).collect(Collectors.toList());
		
		System.out.println(collect);
		
	}			
}
