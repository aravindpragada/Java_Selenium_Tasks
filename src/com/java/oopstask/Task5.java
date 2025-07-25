package com.java.oopstask;

class Vehicle{
	int speed;
	String brand;
	void showDetails() { 
		System.out.println("Brand: " + brand + ", Speed: " + speed + "km/h"); 
		} 
}
class Car extends Vehicle{
	int wheels=4;
	
}
class Bike extends Vehicle{
	int wheels=2;
}

public class Task5 {
	public static void main(String[] args) {
		Car car = new Car(); 
		car.brand = "BMW"; 
		car.speed = 180; 
		car.showDetails(); 
		
		Bike bike = new Bike(); 
		bike.brand = "Yamaha"; 
		bike.speed = 120; 
		bike.showDetails();
	}

}
