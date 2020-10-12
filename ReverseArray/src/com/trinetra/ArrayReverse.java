package com.trinetra;

import java.util.Scanner;
/*
public class ArrayReverse {

//this is for only print in reverse but couldnot store

	public static void main(String[] args) 
    {
	int a[] = new int[]{3,2,1};
	
	for(int i=a.length-1; i>=0; i--){
		
		System.out.println("The reversed Elements are : " + a[i]);
	}
    }
    }*/

/*public class ArrayRetrieve{
	
	public static void main(String[] args) {
		
		int a[] = new int[]{3,2,1};
		
		for(int i=0; i<a.length; i++){
			
			System.out.println( a[i]);
		}
	}
}



*//*
public class ArrayReverse {
	
	//this is for storing array in reverse
	
	 public static void main(String[] args) {
	      int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
	      System.out.println("Array before reverse:");
	      
	      for (int i = 0; i < a.length; i++) {
	         System.out.print(a[i] + " ");
	      } 
	      for (int i = 0; i < a.length / 2; i++) {
	         int temp = a[i];//  a[0]  = 1 wil store in temp
	         a[i] = a[a.length - 1 - i];// 9 will storie in 0th position
	         a[a.length - 1 - i] = temp;// 1 will store in 9 position
	      } 
	      System.out.println("\nArray after reverse:");
	      for (int i = 0; i < a.length; i++) {
	         System.out.print(a[i] + " ");
	      } 
	   }
	
}
*/

public class ArrayReverse{
	
	
	static void reverse(int a[], int n) 
    { 
		for (int i = 0; i < a.length / 2; i++) {
	         int temp = a[i];//  a[0]  = 1 wil store in temp
	         a[i] = a[a.length - 1 - i];// 9 will storie in 0th position
	         a[a.length - 1 - i] = temp;// 1 will store in 9 position
	      } 
  
        /*printing the reversed array*/
        System.out.println("Reversed array is: \n"); 
        for (int k = 0; k < n; k++) { 
            System.out.println(a[k]); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        int [] arr = {10, 20, 30, 40, 50}; 
        reverse(arr, arr.length); 
    } 
} 




/*
public class ReverseArray{
	
	static void reverse(int a[], int n){
		
		for(int i=0; i<a.length/2; i++){
			
			int temp = a[i];
			a[i] = a[n-1-i];
			a[n-1-i] = temp;
		}
	
	System.out.println("The Elements in Reverse");
	
	for(int k=0; k<n; k++){
		System.out.println(a[k]);
	}
	}
	public static void main(String[]args){
		
		int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10};
		
		reverse(arr , arr.length);
		
		
	}
}
	
*/

