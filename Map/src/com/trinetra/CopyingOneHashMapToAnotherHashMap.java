package com.trinetra;

import java.util.HashMap;
import java.util.Map;

public class CopyingOneHashMapToAnotherHashMap {

	public static void main(String[] args) {
		
		Map<Integer,String> colorMap = new HashMap<>();
		Map<Integer,String> colorMap2 = new HashMap<>();
		
		colorMap.put(1, "Red");
		colorMap.put(2, "Orange");
		colorMap.put(3, "Green");
		
		System.out.println(colorMap);
		
		colorMap2.put(4, "yellow");
		colorMap2.put(5, "purple");
		colorMap2.put(6, "blue");
		
		System.out.println(colorMap2);
		
		colorMap.putAll(colorMap2);// Adding one hashmap to another
		
		System.out.println(colorMap);
		
		
		
	}
}
