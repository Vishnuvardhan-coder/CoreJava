package com.trinetra;

import java.util.HashMap;
import java.util.Map;

public class CheckMapContainsKeyOrNot {
	
	public static void main(String[] args) {
		
		Map<String,Integer> hmap = new HashMap<String,Integer>();
		
		hmap.put("vishal", 10);
		hmap.put("suman", 20);
		hmap.put("raman", 15);
		
		System.out.println("Total Map Size "+hmap.size());
		
		System.out.println(hmap);
		
		if(hmap.containsKey("raman")) {
			
			System.out.println(hmap.get("raman")); //here we get value not key
			
			
		}
	}

}
