package com.trinetra;

public class fibonacci {
	
	
	public static void main(String[] args) {

		int a=0,b=1,c=0;
		
		System.out.print(a+" "+b); //0 1
		
		for(int i =0 ; i<=15; i++) {
			
			c=a+b; // 0+1 = 1
			
			System.out.print(" "+c);//0 1 1
			
			a=b; // a=1
			b=c; // b= 1 next loop a+b(1+1) c = 2 i.e 0 1 1 2
		}
	}

}
