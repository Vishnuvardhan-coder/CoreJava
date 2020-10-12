package com.trinetra;

import java.util.Scanner;

public class CheckString {
	
	
	public static void main(String[] args) {
		
		String s2 = "";
		int jcurrent = 0;
		String str = "geeresbfefeeoerereroerereker";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s1 = sc.nextLine();
		for(int i=0; i<str.length(); i++){
			for(int j=0; j<s1.length(); j++){
				if(str.charAt(i)==s1.charAt(j)){
					s2=s2.concat(String.valueOf(str.charAt(i)));
				}
				
				jcurrent = j;
				
				break;
			}
		}
		if(s1.equals(s2)){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}

}
