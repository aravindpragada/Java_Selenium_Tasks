package com.java.exceptionHandling;

class Vehicle {
	public final void engineType() {
		System.out.println("Final Method...");
	}
}
class Car extends Vehicle{
//	public void engineType() {
//		System.out.println("Cannot Overriden method");
//	}
}

final class Constants {
	public static final double GRAVITY = 9.8;
}

// class Physics extends Constants{
//		System.out.println("Cannot Extends Classes");
// }
public class Task3 {
	public static void main(String[] args) {
		final double PI = 3.14;
		System.out.println("Final Variable Value of PI :"+ PI);
		//PI = 3.1433; error shows
	}

}
