package com.java.oopstask;

import java.util.Arrays;
import java.util.List;

public class Task12 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice","Aravind","Bob","Anil","Kiran");
		names.forEach(name->System.out.print(name+" "));
		System.out.println("Starts with A : ");
		names.stream()
			 .filter(n->n.startsWith("A"))
			 .forEach(System.out::println);
		System.out.println("Sorted names : ");
		names.stream()
			.sorted()
			.forEach(System.out::println);
	}
}
