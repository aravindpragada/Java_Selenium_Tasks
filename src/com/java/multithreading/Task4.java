package com.java.multithreading;

public class Task4 extends Thread{
	public void run() {
		System.out.println("Thread running...");
	}
	public static void main(String[] args) throws InterruptedException {
		Task4 t = new Task4();
		System.out.println("Is Alive before Start: "+t.isAlive());
		t.start();
		System.out.println("Is Alive After Start: "+t.isAlive());
		t.join();
		System.out.println("Is Alive before join: "+t.isAlive());

	}
}
