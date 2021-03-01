package com.trinetra;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDecendingOrder {

	public static void main(String[] args) {

		Map<Integer, String> hmap = new HashMap<>();

		hmap.put(1, "orange");
		hmap.put(3, "yellow");
		hmap.put(2, "blue");
		hmap.put(4, "red");

		System.out.println(hmap);

		TreeMap<Integer, String> tmap = new TreeMap<>(hmap);
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		System.out.println(tmap);

		int i = tmap.size();

		while (i > 0) {
			lhm.put(tmap.lastEntry().getKey(), tmap.lastEntry().getValue());

			tmap.remove(i);
			i--;

		}
		System.out.println(lhm);
	}

}