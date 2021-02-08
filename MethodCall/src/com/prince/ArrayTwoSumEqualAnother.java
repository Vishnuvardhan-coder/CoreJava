package com.prince;

public class ArrayTwoSumEqualAnother {
	
	public static void main(String[] args) {
		
	int[] a = {2,4,5,6,8};
	
	int len  = a.length;
	int i =0,j=0;
	
	while(i<=len-1) {
		if(a[i]+a[j+1]==11) {
			
			System.out.println(i +" "+ j);
		}
		j++;
		i++;
	}

}
}
