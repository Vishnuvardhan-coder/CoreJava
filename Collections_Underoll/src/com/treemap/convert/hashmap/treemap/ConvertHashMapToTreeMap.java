package com.treemap.convert.hashmap.treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ConvertHashMapToTreeMap {

	public static void main(String[] args) {
		
	
	HashMap<Integer,Student> hmap = new HashMap<Integer,Student>();
	
/*	hmap.put(22, new Student("s1","mahesh","8th",22));
	
	hmap.put(33, new Student("s2","rajini","7th",33));
	
	hmap.put(44, new Student("s3","kranthi","5th",44));
	
	*/
	
	
	hmap.put( 76, new Student("S01", "Student1", "12th", 76) );
	hmap.put( 57, new Student("S01", "Student1", "12th", 57) );
	hmap.put( 88, new Student("S01", "Student1", "12th", 88) );
	hmap.put( 65, new Student("S01", "Student1", "12th", 65) );
	hmap.put( 46, new Student("S01", "Student1", "12th", 46) );

	
	/*
	 * hmap.forEach((k,v) -> { System.out.println(k+" "+v); });
	 */
	for(Map.Entry<Integer, Student> entry : hmap.entrySet()){
		
		System.out.println(entry.getKey()+ "=>" +":"+entry.getValue());
	}
	

	
	System.out.println();
	
	TreeMap<Integer,Student> tmap = new TreeMap<Integer,Student>(hmap);
	
	for(Map.Entry<Integer, Student> entry : tmap.entrySet()){
		
		System.out.println(entry.getKey()+ "=>" + ":" + entry.getValue());
	}
	
	
		
		
		
}}