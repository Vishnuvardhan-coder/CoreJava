package com.trinetra;

import java.util.Scanner;

public class PolindramExample {

	public static void main(String[]args){
	
		String a, b = "";
Scanner sc = new Scanner(System.in);


System.out.println("Enter String");

   a = sc.nextLine();
 
 for(int i=a.length()-1; i>=0; i--){
	 
	b = b+a.charAt(i); // adding a-string to b
	 
 }
 if(a.equalsIgnoreCase(b)){
	 
	 System.out.println("The Given String Polindram");
	 
 }
 else
 {
	 System.out.println("Not Polindram");
 }
}
}