package com.prince;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonTest {
	public static void main(String[] args) {
		

	Person p1 = new Person(1,"visnu",25);
	Person p2 = new Person(2,"kdam",32);
	
	List<Person> alist = Arrays.asList(p1,p2);
	
	List<Person> collect = alist.stream().filter(ks->ks.getAge()>18).collect(Collectors.toList());

	System.out.println(collect);
}
}
