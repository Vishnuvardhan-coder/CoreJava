package com.trinetra;

import java.util.Scanner;


public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		
		int num1 = s.nextInt();
		
		System.out.println("Enter Second Number");
		
		int num2 = s.nextInt();
		
		System.out.println("Intial Values "+num1+" , "+num2);
		
		num1=num1+num2; 
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After Swap number1 "+num1+" And number2 "+num2);
		
		
		
		
		
	}

}
