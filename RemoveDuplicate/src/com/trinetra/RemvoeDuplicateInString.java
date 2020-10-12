package com.trinetra;

import java.util.HashSet;
import java.util.Set;

/*
public class RemvoeDuplicateInString {

	public static void main(String[] args) {

	
		String s1 = "harikrishna";
		String s2 = " ";
		
		for(int i=0; i<s1.length(); i++){
		
		boolean flag = false;
		
		for(int j=0; j<s2.length(); j++){
		
		if(s1.charAt(i)==s2.charAt(j))
				{
			 flag = true;
			break;
	}
		}
		
		if(flag ==false)
		{
			s2=s2.concat(String.valueOf(s1.charAt(i)));
		}
		}
		System.out.println(s2);
		}
	
}
*/

public class RemvoeDuplicateInString {

	public static void main(String[] args) {
		
		
		
		String str = "sandeep";
		System.out.println(removeDuplicate(str));
	}
		
		public static String removeDuplicate(String str){
		Set<Character> s = new HashSet<>();
		StringBuffer sb = new StringBuffer();
		
						
		for(int i=0;i<str.length();i++){
			
			Character c = str.charAt(i);
			if(!s.contains(c)){
				s.add(c);
				sb.append(c);
			}
			
		}
		
		return sb.toString();	
		}
		
		
		
		
	}