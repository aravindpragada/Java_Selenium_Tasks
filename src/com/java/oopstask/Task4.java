package com.java.oopstask;

abstract class Shape {
    abstract double area(); 
}

class Circle extends Shape{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	double area() {
		return Math.PI*radius*radius;
	}
}
class Rectangle extends Shape{
	double length,width;
	Rectangle(double length, double width){
		this.length=length;
		this.width=width;
	}
	double area() {
		return length*width;
	}
}
public class Task4 {
	public static void main(String[] args) {
		Shape circleObj = new Circle(5);
		Shape rectObj = new Rectangle(10,5);
		System.out.println("Circle Radius : "+circleObj.area());
		System.out.println("Rectangle Radius : "+rectObj.area());
	}
}
