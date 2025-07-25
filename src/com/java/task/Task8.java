package com.java.task;

import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;

		do {
			System.out.print("Enter a positive number (Enter 1 to stop): ");
			number = scanner.nextInt();
		} while (number != 1);

		System.out.println("You entered 1. Program ended.");
		scanner.close();
	}

}
