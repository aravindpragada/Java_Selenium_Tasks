package com.java.ExcepHandminiproject;

public abstract class Book {
    protected int id;
    protected String title;
    protected String author;
    protected boolean isBorrowed;

    public static final String LIBRARY_NAME = "City Public Library";
    public static final String LIBRARY_ADDRESS = "123 Main Street, Metro City";

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public abstract void displayDetails();
}

