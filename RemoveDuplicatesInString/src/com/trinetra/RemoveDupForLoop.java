package com.trinetra;

public class RemoveDupForLoop {

	public static void main(String[] args) {
		
		String s = "abcabc";
		String temp = "";
		
		char[] ch = s.toCharArray();
		
		for(int i=0; i<s.length()-1; i++) {
			for(int j=i+1; j<s.length();j++) {
				if(ch[i]==ch[j]) {
					temp += ch[i];
				}
			}
		}
		System.out.println(temp);
		
	}
}
