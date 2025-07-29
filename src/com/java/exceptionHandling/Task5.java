package com.java.exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Task 5: Custom Exception
class InvalidAccountException extends Exception {
    public InvalidAccountException(String message) {
        super(message);
    }
}

public class Task5 {

    // Task 3: Throw and Throws
    static void validateAge(int age) throws Exception {
        if (age < 18)
            throw new Exception("Age must be 18 or above!");
        else
            System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 1: Try-Catch (Division by zero)
        try {
            System.out.print("Enter a number to divide 100: ");
            int num = sc.nextInt();
            int result = 100 / num;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        }

        // Task 2: Try-Catch-Finally (File Reading)
        Scanner fileScanner = null;
        try {
            File file = new File("example.txt"); // Make sure the file exists
            fileScanner = new Scanner(file);
            System.out.println("\nFile content:");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } finally {
            if (fileScanner != null) {
                fileScanner.close();
                System.out.println("File scanner closed.");
            }
        }

        // Task 3: Throw and Throws (Age validation)
        try {
            System.out.print("\nEnter age: ");
            int age = sc.nextInt();
            validateAge(age);
        } catch (Exception e) {
            System.out.println("Validation Error: " + e.getMessage());
        }

        // Task 4: Multiple Catch Blocks
        try {
            int[] arr = {1, 2, 3};
            System.out.println("\nArray value: " + arr[5]); // ArrayIndexOutOfBounds
            int x = 10 / 0; // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException.");
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException.");
        }

        // Task 5: Custom Exception (InvalidAccountException)
        try {
            double balance = -500;
            if (balance < 0) {
                throw new InvalidAccountException("Account balance cannot be negative.");
            }
        } catch (InvalidAccountException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        sc.close();
    }
}

