package com.java.oopstask;

public class Task1 {
	String title;
	String author;
	double price;

	public Task1(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public void displayDetails() {
		System.out.println("Task1 [title=" + title + ", author=" + author + ", price=" + price + "]");
	}

	public static void main(String[] args) {
		Task1 obj = new Task1("Java Fundamentals", "John", 300.0);
		Task1 obj2 = new Task1("Python Fundamentals", "Allen", 250.0);
		
		obj.displayDetails();
		obj2.displayDetails(); 
	}
}
