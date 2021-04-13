package com.trinetra;

import java.util.HashMap;
import java.util.Map;

public class CheckHashMapMappedToSpecificValue {

	public static void main(String[] args) {

		Map<Integer,String> hmap = new HashMap<Integer,String>();
		
		hmap.put(1, "Red");
		hmap.put(2, "Green");
		hmap.put(3, "Blue");
		
		if(hmap.containsValue("Green")) {
			System.out.println("Contains Value : ? "+ "yes !");
		}else {
			System.out.println("Contains Value : ? "+ "no !");
		}
		
	}

}
