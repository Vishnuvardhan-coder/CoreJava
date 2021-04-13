package com.trinetra;

import java.util.HashMap;
import java.util.Map;

public class UpdateHashMapOfElements {

	public static void main(String[] args) {

		Map<Integer,String> hmap = new HashMap<Integer,String>();
		
		hmap.put(10, "satish");
		hmap.put(30, "mahesh");
		hmap.put(20, "babu");
		
		System.out.println(hmap);
		
		hmap.put(30, "suresh"); //this wil update value in hashmap
		
		System.out.println(hmap);
	}

}
