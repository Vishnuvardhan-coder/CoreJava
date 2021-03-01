package com.trinetra;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDecendingOrder3 {
	
	public static void main(String[] args) {
		
	
	Map<Integer,String> hmap = new TreeMap<>((I1,I2)->(I1>I2) ? -1:(I1<I2)? 1:0);
	hmap.put(1,"orange");
	hmap.put(3,"yellow");
	hmap.put(2, "blue");
	hmap.put(4, "red");
	System.out.println(hmap);
	

}
}
