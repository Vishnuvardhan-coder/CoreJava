package com.string.reverse.each.word;


public class Rev{
	
	public static void main(String[] args) {
		
		reverseEachword("I Love Java");
	
	}
		static void reverseEachword(String input){
			
			String reverseString = "";
			String[] words = input.split(" ");
			
			for(int i=0; i<=words.length-1; i++){
				
				String word = words[i];
				
				String reverseWord = "";
			
			for(int j=word.length()-1; j>=0; j--){
				
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseString = reverseString + reverseWord + " ";
		}
	
		System.out.println(reverseString);
}}