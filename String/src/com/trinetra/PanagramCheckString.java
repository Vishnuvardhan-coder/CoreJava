package com.trinetra;

public class PanagramCheckString {
	
	public static void main(String[] args) {
		
		String str = "Hello World vishnu vardhan super star";
		
		System.out.println(isPanagram(str.toLowerCase()));
		
	}

	private static boolean isPanagram(String str) {
		
		if(str.length()<26) {
			return false;
		}else {
			
			for(char ch='a';ch<='z';ch++) {
				
				if(str.indexOf(ch)<0) { //it if the character not available in string it gives -1
				return false;	
				}
				
			}
			return true;
		}
		
		
	}

}
