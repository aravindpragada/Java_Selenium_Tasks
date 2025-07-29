package com.java.ExcepHandminiproject;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook(101, "Java Basics", "James Gosling");
        LibraryBook book2 = new LibraryBook(102, "OOP Concepts", "Bjarne Stroustrup");

        System.out.println("Welcome to " + Book.LIBRARY_NAME);
        System.out.println("Address: " + Book.LIBRARY_ADDRESS);
        System.out.println("----------------------------");

        book1.displayDetails();
        book2.displayDetails();

        System.out.println("\nBorrowing Books:");
        try {
            book1.borrowBook();
            book2.borrowBook();
            book1.borrowBook(); 
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nReturning Books:");
        try {
            book1.returnBook(true); 
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            book2.returnBook(false); 
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nPolicy Info:");
        book1.returnPolicy();
    }
}
