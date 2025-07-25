package com.java.oopstask;

@FunctionalInterface 
interface MathOperation { 
	int operate(int a, int b); 
}

public class Task11 { 
	public static void main(String[] args) { 
		MathOperation add = (a, b) -> a + b; 
		MathOperation sub = (a, b) -> a - b; 
		MathOperation mul = (a, b) -> a * b; 
		System.out.println("Add: " + add.operate(10, 5)); 
		System.out.println("Sub: " + sub.operate(10, 5)); 
		System.out.println("Mul: " + mul.operate(10, 5)); 
	} 
} 
