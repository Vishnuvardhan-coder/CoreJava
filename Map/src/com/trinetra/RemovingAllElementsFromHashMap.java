package com.trinetra;

import java.util.HashMap;
import java.util.Map;

public class RemovingAllElementsFromHashMap {

	public static void main(String[] args) {

		Map<Integer, String> colorMap = new HashMap<>();

		colorMap.put(1, "Red");
		colorMap.put(2, "Orange");
		colorMap.put(3, "Green");

		System.out.println(colorMap);
		
		colorMap.clear();
		
		System.out.println(colorMap);
	}
}
