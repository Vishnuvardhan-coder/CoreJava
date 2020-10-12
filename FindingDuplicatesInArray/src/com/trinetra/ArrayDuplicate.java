package com.trinetra;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicate {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int a[] = {1,2,3,4,5,5,2,4,6,7,2};
		for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
		if((a[i] == a[j]) && (i!=j) ){
		System.out.print(a[j]);
		}

		}

		}*/
			
			int a[] = {1,1,2,3,5,5,6,7,8,8};
			
			Set<Integer> s = new HashSet();
			
			for(int num : a){
				
				if(s.add(num)==false){
					System.out.println(num);
				}
			}

		}}