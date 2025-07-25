package com.java.task;

public class Task4 {
	public static void main(String[] args) {
		int num1 =10;
		System.out.println("Incremenrt/decrement");
		System.out.println(num1++);
		System.out.println(++num1);
		System.out.println(num1--);
		System.out.println(--num1);

		System.out.println("Bitwise shift");
		int a =11;
		System.out.println("Left shift : "+ (a<<1));
		System.out.println("Right shift : "+ (a>>1));
		System.out.println("Unsigned right shift : "+ (a>>>1));

		System.out.println("Logical and bitwise AND");
		int x = 5, y = 10;

		System.out.println("Logical AND " + (x > 0 && y > 5));
		System.out.println("Bitwise AND " + (x > 0 & y > 5)); 
	}

}
