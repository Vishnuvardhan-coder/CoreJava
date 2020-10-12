package com.treemap.convert.hashmap.treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CovertHashMapToTreeMapUsePutAll {

	public static void main(String[] args) {

		HashMap<Integer, Student> hmap = new HashMap<Integer, Student>();

		hmap.put(22, new Student("s1", "abc", "10th", 22));

		hmap.put(43, new Student("s4", "def", "9th", 43));

		hmap.put(33, new Student("s3", "vgh", "15th", 33));

		for (Map.Entry<Integer, Student> entry : hmap.entrySet()) {

			System.out.println(entry.getKey() + "=>" + ":" + entry.getValue());

		}
		
		System.out.println();
		
		TreeMap<Integer,Student> tmap = new TreeMap<Integer,Student>();
		
		
		tmap.putAll(hmap);
		
		
		for(Map.Entry<Integer, Student> entry : tmap.entrySet()){
			
			
			System.out.println(entry.getKey()+ "=>" +  ":" + entry.getValue());
		}

		

	}
}
