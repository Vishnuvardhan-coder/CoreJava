package com.treemap.convert.hashmap.treemap;

public class Student {

	private String sno;
	private String name;
	private String section;
	private int marks;
	public int getMarks() {
		return marks;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", section=" + section + ", marks=" + marks + "]";
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getSno() {
		return sno;
	}
	public Student(String sno, String name, String section, int marks) {
		super();
		this.sno = sno;
		this.name = name;
		this.section = section;
		this.marks = marks;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
}
