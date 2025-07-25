package com.java.task;

public class Task5 {
	public static void main(String[] args) {
		int a=10,b=20,c=5;
		if(a>b&&a>c) {
			System.out.println("a is bigger number");
		}else if(b>a&&b>c) {
			System.out.println("b is bigger number");
		}else {
			System.out.println("c is bigger number");
		}
		int result = (a>b)&&(a>c)?a:b;
		int finalResult = (b>a)&&(b>c)?b:c;
		System.out.println(finalResult);
	}
}
