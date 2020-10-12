package com.trinetra;

public class DeleteElementFromArray {

	public static void main(String[] args) {

		
		int a[] = { 10,15,30,40,20,60};
		
		int delete = 30;
		
		for(int i=0; i<a.length; i++){
			
			if(delete==a[i]){
				
				for(int j=i; j<a.length-1; j++){
					
					a[j] = a[j+1]; // move element right to left
				}
				break;
			}
		}
		
		for(int k=0; k<a.length; k++){
			System.out.println(" " + a[k]);
		}
	}

}
