package com.trinetra;

import java.util.Scanner;

class Utility{
static boolean NumberOrnot(String input){
	
	try{
		
		Integer.parseInt(input);
	}catch(NumberFormatException e){
		return false;
	}
	return true;
}
}





public class FindNumberOrString {
	
	public static void main(String[] args) {
		
	
		System.out.println("Enter Mobile Number");
	
	Scanner s = new Scanner(System.in);
	String input = s.next();
	if(Utility.NumberOrnot(input) && (input.length()==10)){
		System.out.println("Good!!! You have entered valid mobile number");
	}
    else
    {
        System.out.println("Sorry!!!! You have entered invalid mobile number. Try again...");
    }

}}
