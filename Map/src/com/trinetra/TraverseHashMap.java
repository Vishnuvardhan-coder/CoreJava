package com.trinetra;

import java.util.HashMap;
import java.util.Map;

public class TraverseHashMap {
	
	public static void main(String[] args) {
		
		Map<Integer,String> hmap = new HashMap<>();
		
		hmap.put(1, "red");
		hmap.put(2, "yellow");
		hmap.put(3, "green");
		
		System.out.println(hmap);
		
		for(Map.Entry<Integer, String> entry : hmap.entrySet()) {
			
			System.out.println("Key :" + entry.getKey() + "\t"+ "Value :"+ entry.getValue());
		}
		
		
		
	
		
		
		
	}

}
