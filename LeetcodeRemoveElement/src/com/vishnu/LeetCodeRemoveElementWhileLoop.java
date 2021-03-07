package com.vishnu;

import java.util.Arrays;

public class LeetCodeRemoveElementWhileLoop {

	public static void main(String[] args) {
		
		int nums[] = {2,3,3,2};
		int value = 0;
		 System.out.println(removeElement(nums,value));
		
	}

	private static int removeElement(int[] nums, int value) {

		int i=0,j=0;
		
		while(i<nums.length) {
			
			if(nums[i]!=value) {
				nums[j++] = nums[i];
			}
			i++;
		}
		System.out.println(Arrays.toString(nums));
		return j;
		
		
	}
}
