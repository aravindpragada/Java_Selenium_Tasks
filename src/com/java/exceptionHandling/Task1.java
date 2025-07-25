package com.java.exceptionHandling;

abstract class Shape{
	abstract double area();
	
	void displayShapeType() {
        System.out.println("This is a shape.");
    }
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
    @Override
    void displayShapeType() {
        System.out.println("This is a Circle shape.");
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
    @Override
    void displayShapeType() {
        System.out.println("This is a Rectangle shape.");
    }
}

public class Task1 {
	public static void main(String[] args) {
		Shape circle = new Circle(5.0); 
        Shape rectangle = new Rectangle(4.0, 6.0); 

        circle.displayShapeType();
        System.out.println("Area of Circle: " + circle.area());
        rectangle.displayShapeType();
        System.out.println("Area of Rectangle: " + rectangle.area());
	}

}
