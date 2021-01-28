package com.prince;

public class Person {

	private Integer pid;
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", age=" + age + "]";
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(Integer pid, String name, Integer age) {
		super();
		this.pid = pid;
		this.name = name;
		this.age = age;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	private String name;
	private Integer age ;
}