package com.java.ExcepHandminiproject;

public class LibraryBook extends Book implements Borrowable {

    public LibraryBook(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public void displayDetails() {
        System.out.println("Book ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Borrowed: " + (isBorrowed ? "Yes" : "No"));
    }

    @Override
    public void borrowBook() throws Exception {
        if (isBorrowed) {
            throw new Exception("Book already borrowed!");
        } else {
            isBorrowed = true;
            System.out.println(title + " has been borrowed.");
        }
    }

    @Override
    public void returnBook(boolean late) throws Exception {
        if (!isBorrowed) {
            throw new Exception("Book is not currently borrowed.");
        }
        isBorrowed = false;
        if (late) {
            throw new Exception("Book returned late! Please pay the fine.");
        } else {
            System.out.println(title + " returned successfully.");
        }
    }
}

