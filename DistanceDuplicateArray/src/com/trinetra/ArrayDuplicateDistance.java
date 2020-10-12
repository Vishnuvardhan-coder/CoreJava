package com.trinetra;

public class ArrayDuplicateDistance {
	public static void main(String[] args) {
	
		int temp = 0;
		
	int a[] = new int[]{1,2,3,1};
	
	for(int i=0; i <a.length; i++){
		for(int j=i+1; j<a.length; j++){
			
			if(a[i]==a[j]){
				 temp = a[i];
				 temp = a[j];
			}
			
		}
		
	}
System.out.println(temp);
}}
