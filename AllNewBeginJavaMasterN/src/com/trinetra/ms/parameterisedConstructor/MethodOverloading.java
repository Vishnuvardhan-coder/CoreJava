package com.trinetra.ms.parameterisedConstructor;

public class MethodOverloading {

	public int Nothing(int a){
		System.out.println("the value is" +a);
		return a;
		
	}
	
	//overloaded method return type no wory should not be same
	//overloaded method parameter should be different
	
	
	public String Nothing(int a, int b){
		String z = "a"+b;
		System.out.println("Greeting  :"   +z);
		return z;
		
	}

 static class Test{
	 
	 public static void main(String[]args){
		 MethodOverloading mo = new MethodOverloading();
		 mo.Nothing(10, 20);
		 
	 }
	 
	
}}