package com.trinetra;

public class Student {

	private int roolNo;
	public int getRoolNo() {
		return roolNo;
	}
	public void setRoolNo(int roolNo) {
		this.roolNo = roolNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	public Student(int roolNo, String name) {
		super();
		this.roolNo = roolNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roolNo=" + roolNo + ", name=" + name + "]";
	}
	
	
}
