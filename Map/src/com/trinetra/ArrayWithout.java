package com.trinetra;

import java.util.Arrays;

public class ArrayWithout {

	public static void main(String[] args) {

		int[] a = {3,2,1};
		int[] b = new int[a.length];
		int temp;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					
					temp = a[i];
					a[i] = a[j];
					a[j]= temp;
					
					b[i]=a[i];
					
					
				}
			}
		}
		
		System.out.println(Arrays.toString(b));
		
	}

}
