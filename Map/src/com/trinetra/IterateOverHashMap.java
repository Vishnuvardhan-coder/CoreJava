package com.trinetra;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateOverHashMap {
	
	public static void main(String[] args) {
		
		Map<String,Integer> employeSalary = new HashMap<>();
		
		employeSalary.put("ramu", 5000);
		employeSalary.put("raju", 20000);
		employeSalary.put("satish", 15000);
		
		System.out.println("\n=== Iterating HashMap through Java8 forEach");
		employeSalary.forEach((k, v)->{
			System.out.println(k + "==>" + v);
		});
		
		System.out.println("\n=== Iterating HashMap through Java8 forEach ");
		employeSalary.entrySet().forEach(entry -> {
			System.out.println(entry.getKey()+ "=>" +entry.getValue());
		});
		
		System.out.println("\n=== Iterating Over HashMap KeySet");
		employeSalary.keySet().forEach(key ->{
			System.out.println(key +"=>" +employeSalary.get(key));
		});
		
		System.out.println("\n=== Iterating over hashmap using simple for-each loop");
		for(Map.Entry<String, Integer> entry : employeSalary.entrySet()) {
			
			System.out.println("key :"+entry.getKey()+" "+"Value"+entry.getValue());
		}
		
		System.out.println("\n=== Iterating Over the HashMap's entrySet using iterator===");
			Set<Map.Entry<String, Integer>> entrySet = employeSalary.entrySet();
			Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
			
			while(iterator.hasNext()) {
				Map.Entry<String, Integer> entry = iterator.next();
				System.out.println(entry.getKey()+"==>"+entry.getValue());
			}
			
			
		
		
		
	}

}
