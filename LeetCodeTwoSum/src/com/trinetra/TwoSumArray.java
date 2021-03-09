package com.trinetra;

public class TwoSumArray {

	public static void main(String[] args) {
		
		 int a[] = {3,2,4};
		 int target = 6;
		int b[] = findSum(a,target);
		
		for(int ele : b) {
			System.out.print(ele+" ");
		}
		 
	}
	private static int[] findSum(int[] a, int target) {


		 for(int i=0; i<a.length; i++) {
			 for(int j=i+1; j<a.length; j++) {
				 if(a[i]+a[j]==target) {
					 return new int[] {i,j};
				 }

			 }
			 
		 }
		return new int[] {};
		
	}
	}
