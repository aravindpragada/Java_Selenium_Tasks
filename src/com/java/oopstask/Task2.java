package com.java.oopstask;

class Employee {
	String name;
	static int count =0;
	
	public Employee(String name) {
		this.name=name;
		count++;
	}
	void showName() {
		System.out.println("Name of the Employee : "+name);
	}
	static void showCount() {
		System.out.println("Total count of the Employees : "+count);
	}
}
public class Task2 {
	public static void main(String[] args) {
		Employee obj1 = new Employee("Aravind");

		Employee obj2 = new Employee("Ravi");
		
		Employee.showCount();
	}
}
