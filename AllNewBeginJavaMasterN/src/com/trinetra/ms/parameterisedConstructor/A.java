package com.trinetra.ms.parameterisedConstructor;

public class A {

	int x = 0;

	public A() {

		System.out.println("default constuctor called");

		x = 100;

	}

	public void getx() {

		System.out.println("x value is" + x);

	}

	public A(int a){
		x=a;
	}
}
