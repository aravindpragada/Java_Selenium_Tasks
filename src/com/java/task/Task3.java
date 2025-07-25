package com.java.task;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		double result =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Number2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the operators of +,-,*,/%");
		char op = sc.next().charAt(0);
		
		switch(op) {
		case '+':
			result = num1+num2;
			break;
		case '-':
			result = num1-num2;
			break;
		case '*':
			result = num1*num2;
			break;
		case '/':
			if(num2!=0) {
			result = num1/num2;
			}else {
				System.out.println("Cannot divide by zero...");
			}
			break;
		case '%':
			result = num1%num2;
			break;
			
		default:
			System.out.println("Enter correct operator....");
			break;
		}
		
		System.out.println("Result : "+result);
		
	}
	

}
