package com.trinetra;

import java.util.HashMap;
import java.util.Map;

public class HashMapPutIfAbsent {

	public static void main(String[] args) {
		
		Map<String,Integer> hmap = new HashMap<String,Integer>();
		
		hmap.put("one", 1);
		hmap.put("two", 2);
		hmap.put("three", 3);
		
		System.out.println(hmap);
		hmap.putIfAbsent("four", 4); // it wil check for exact key and value if not der it will insert
		System.out.println(hmap);
	}
}
