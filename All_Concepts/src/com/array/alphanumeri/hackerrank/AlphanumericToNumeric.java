 package com.array.alphanumeri.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class AlphanumericToNumeric {
	
//
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
	list.add("one");list.add("two");list.add("three");list.add("four");list.add("five");list.add("six");list.add("seven");list.add("eight");list.add("nine");
		
		String given = "three one two two three three two three";
		
		String[] g = given.split(" ");
		
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		for(String string : g){
			
			if(map.containsKey(list.indexOf(string)+1)){
				  
				map.put(list.indexOf(string)+1,map.get(list.indexOf(string)+1)+1);
			}
			else {
				map.put(list.indexOf(string)+1, 1);
				
			}
		}
			
			map.forEach((k,v)-> { if(k==map.lastKey()){ 
				System.out.println(k + "-" +v);
				}
			else {System.out.println(k + "-" + v + ",");}
			});
		
	}}

	
