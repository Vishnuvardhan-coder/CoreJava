package com.two.arrays.same.or.not;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {

		
		int a[] = { 3,5,2,7 };
		int b[] = { 3,5,2,7 };
		
		boolean equalOrNot = true;
		
		if(a.length == b.length){
			
			for(int i=0; i<a.length; i++){
				
				if(a[i]!= b[i]){
					
					 equalOrNot = false;
					
				}
			}
		}
		
		else {
			equalOrNot = false;
		}
		
		if(equalOrNot){
			System.out.println("equl");
		}
		else{
			System.out.println("not equal");
		}
	}

}
