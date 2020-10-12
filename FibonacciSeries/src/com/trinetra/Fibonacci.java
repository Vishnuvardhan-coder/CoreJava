package com.trinetra;

import java.util.Scanner;

// 0 1 1 2 3 5
public class Fibonacci {
	
  static int n1=0,n2=1,n3=0;
	
	static void Fibonacci(int num){
		if(num>0){
		n3 = n1+n2;
		n1 = n2;
		n2 = n3;
		
		System.out.print(" "+n3);
		
		Fibonacci(num-1);
	}
	}
	
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		int a = s.nextInt();
		
		System.out.print(n1+" "+n2);
		
		Fibonacci(a-2);
	}

}
