package com.vishnu;

import java.util.ArrayList;
import java.util.List;

/*Given a non-empty array of integers nums,
every element appears twice except for one. 
Find that single one.*/
public class SingleNumber {

	public static void main(String[] args) {

		int a[] = { 4, 1, 2, 1, 2 };
	//	int a[] = {0,1,0,1,0,1,99};
		
		System.out.println(singleNumber(a));
	}
		/*
		 * public static int singleNumber(int[] nums) {
		 * 
		 * boolean x = false; int c=0; int i=0; for( i=0; i<nums.length-1; i++){
		 * 
		 * 
		 * for(int j=i+1; j<nums.length; j++){
		 * 
		 * 
		 * if(nums[i]!=nums[j]){
		 * 
		 * c=nums[j]; } } } return c; }
		 * 
		 * List<Integer> alist = new ArrayList<>();
		 * 
		 * for (int n : a) {
		 * 
		 * if (!alist.contains(n)) {
		 * 
		 * alist.add(n);
		 * 
		 * }else { alist.remove(new Integer(n)); } } System.out.println(alist);
		 */
		public static int singleNumber(int[] a) {
        List<Integer> alist = new ArrayList<>();
        
        for(int n : a){
        
            if(!alist.contains(n)){
                alist.add(n);
                
            }else{
            	//alist.remove(n); --> it will remove specific element based on index
                alist.remove(new Integer(n));// it will remove specific element based on degit
            }
        }
        
        return alist.get(0);
	}
	
	
}
