package com.trinetra;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDecendingOrder2 {

	public static void main(String[] args) {
		
	Map<Integer,String> hmap = new HashMap<>();
	
	 hmap.put(1,"red");
	 hmap.put(3,"orange");
	 hmap.put(2,"yellow");
	 hmap.put(4,"blue");
	 
	 TreeMap<Integer,String> tmap = new TreeMap<>(Collections.reverseOrder());
	 
	 tmap.putAll(hmap);
	 
	 System.out.println(tmap);
	 
	 
	 
	
	}
}
