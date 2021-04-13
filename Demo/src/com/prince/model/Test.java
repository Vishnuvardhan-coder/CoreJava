package com.prince.model;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test {

	public static void main(String[] args) {

		List<Employee> alist = Stream
				.of(new Employee(1, "suki", 20000d), new Employee(2, "balu", 20000d), new Employee(3, "vishnu", 50000d))
				.collect(Collectors.toList());

		alist.forEach(e -> System.out.println(e));
		// alist.forEach(System.out::println);

		HashMap<Integer, Employee> hmap = new HashMap<Integer, Employee>();

		hmap.put(1, new Employee(1, "balu", 20000d));
		hmap.put(2, new Employee(2, "suki", 30000d));

	}
}
