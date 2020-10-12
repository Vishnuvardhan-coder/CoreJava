package com.trinetra;

public class Employee {

	private int i;
	private String name;
	
	
	
	public Employee(int i, String name) {
		super();
		this.i = i;
		this.name = name;
	}



	@Override
	public String toString() {
		return "Employee [i=" + i + ", name=" + name + "]";
	}
}
