package com.trinetra;

public class FirstLetterPrintInWordsString {
	
	public static void main(String[] args) {
		
		String str = "Learn Code With Me";
		splitWords(str);
	}

	private static void splitWords(String str) {
		
	String[] words = str.split(" ");
	
	for(int i=0; i<words.length; i++) {
		
	 String  s = words[i];
	 
	  System.out.println(s.charAt(0)); // LCWM
	}
	
		
	}

}
