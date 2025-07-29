package com.java.ExcepHandminiproject;

public interface Borrowable {
    void borrowBook() throws Exception;
    void returnBook(boolean late) throws Exception;

    default void returnPolicy() {
        System.out.println("Return Policy: Books must be returned within 14 days.");
    }
}
