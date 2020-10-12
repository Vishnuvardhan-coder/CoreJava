package com.trinetra.ms.parameterisedConstructor;

public class Palindrome {
	
 public static void main(String[] args) {
	
	 int num = 161;
	 int n = num;
	 int reverse = 0 ;
	 for(int i=0; i<=num; i++){
		 
		 int r = num % 10;
		 num = num/10;
		 reverse = reverse*10+r;
		 i=0;
	 }
	 if(n==reverse){
		 System.out.println("number is polindrome");
	 }
	 else{
		 System.out.println("number is not polindrome");
	 }
	 
}

	}
	
	
	
