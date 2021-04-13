package com.trinetra;

import java.util.HashMap;
import java.util.Map;

public class RemovingElementFromHashMap {

	public static void main(String[] args) {
		
		Map<Integer,String> hmap = new HashMap<>();
		
		hmap.put(1, "bimu");
		hmap.put(2,"ramu");
		hmap.put(3, "somu");
		
		System.out.println(hmap);
		
		hmap.remove(2); // it will remive key 2

		System.out.println(hmap);
		
		boolean isDeleted = hmap.remove(2,"momu"); // deletes only if key and value mapped corectly
		System.out.println(isDeleted);//false
		
		
	}
}
