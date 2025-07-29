package com.java.multithreading;

public class Task2 implements Runnable {
	public void run() { 
		for(int i = 1; i <= 10; i++) { 
			System.out.println("Count: " + i); 
		} 
	} 
	public static void main(String[] args) { 
		Task2 task = new Task2(); 
		Thread thread = new Thread(task); 
		thread.start(); 
	} 
}
