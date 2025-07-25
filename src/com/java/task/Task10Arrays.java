package com.java.task;

import java.util.Scanner;

public class Task10Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Enter the 10 numbers : ");
		for(int i=0;i<10;i++) {
			arr[i] = sc.nextInt();
		}
		int sum=0;
		int min = arr[0];
		int max = arr[0];

		for(int numbers:arr) {
			sum+=numbers;
			if(numbers<min) {
				min = numbers;
			}
			if(numbers>max) {
				max = numbers;
			}
		}

		double average = (double)(sum/arr.length);

		System.out.println("Average : "+average);
		System.out.println("Minimum No : "+min);
		System.out.println("Maximum No : "+max);

	}

}
