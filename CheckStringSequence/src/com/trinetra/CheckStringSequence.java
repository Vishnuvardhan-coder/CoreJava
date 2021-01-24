package com.trinetra;

import java.util.Scanner;

public class CheckStringSequence {
		
		public static void main(String[] args) {
			
			String s2 = "";
			int jcurrent = 0;
			String str = "geeresbfefeeoerereroerereker";
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String");
			String s1 = sc.nextLine();
			for(int j=jcurrent; j<s1.length();  j++){
				for(int i=0; i<str.length(); i++){
					if(str.charAt(i)==s1.charAt(j)){
						s2=s2+str.charAt(i);
						break;
					}
				
				jcurrent = j;
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