package com.trinetra;

import java.util.Scanner;

public class PrimeNumber {
	
	/*static int i,m=0,flag=0;
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		int num = s.nextInt();
		
		m = num/2 ; // num=10 so half 12345 will check if no modle by zero then not prime
	
		if(num==0 || num==1){
			
			System.out.println("Given Number NOt a Prime Number");
		}else{
			for(i=2;i<=m;i++){
				if(num%i==0){
					System.out.println("it is not a prime number");
					flag = 1;	
					break;
				}
			}
				if(flag==0){
					
					System.out.println("is a prime number");
				
			}
		}

	} 
	
*/	
	
	public static void main(String[] args) {
		
		int n = 2; int temp=0;
		
		for(int i=2;i<=n-1;i++){
			if(n%i == 0){//7/2 , 7/3 , 7/4 , 7/5 , 7/6, 7/7 
				temp = temp+1;
			}
		}
		 
		if(temp==0){
			System.out.println("prime number");
			
		}
			else{
				System.out.println("not prime number");
			}
		}
}

