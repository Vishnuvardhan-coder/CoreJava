package com.trinetra;

import java.util.HashMap;
import java.util.Map;

public class CheckHashMapEmptyOrNot {

	public static void main(String[] args) {

		Map<Integer, String> colorMap = new HashMap<>();

		colorMap.put(1, "Red");
		colorMap.put(2, "Orange");
		colorMap.put(3, "Green");
		
		boolean isEmpty = colorMap.isEmpty();
			
		System.out.println("hash Map is Empty : "+isEmpty);
		
		colorMap.clear();
		
		 isEmpty = colorMap.isEmpty();
		System.out.println("hash Map is Empty : "+isEmpty);
		

	}
}
