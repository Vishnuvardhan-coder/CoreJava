package com.prince;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxScorer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of Players");
		
		int n = sc.nextInt();
		sc.nextLine();
		
		HashMap<String, Long> hmap = new HashMap<String,Long>();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter ther details of the player" +(i+1));
			String name = sc.nextLine();
			Long l = sc.nextLong();
			sc.nextLine();
			hmap.put(name, l);
		}
		Long maxValueInMap = Collections.max(hmap.values());
		for(Map.Entry<String, Long> entry : hmap.entrySet()) {
			if(entry.getValue()==maxValueInMap) {
				System.out.println(entry.getKey());
			}
		}
	}

}
