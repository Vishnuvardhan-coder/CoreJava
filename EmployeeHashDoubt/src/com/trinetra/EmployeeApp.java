package com.trinetra;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EmployeeApp {


public static void main(String[] args) {
	

		
		
		Set<Employee> empset = new HashSet<Employee>();
		
		empset.add(new Employee(10,"Ramesh"));
		empset.add(new Employee(10,"Ramesh"));
		//System.out.println(empset);
		Iterator itr = empset.iterator();
		while(itr.hasNext()){
		Object o = itr.next();
		System.out.println(o);
		}
		
}
}
