package com.java.multithreading;

class Task1 extends Thread { 
	public void run() { 
		for(int i = 0; i < 5; i++) { 
			System.out.println("Hello from Thread!"); 
			try { 
				Thread.sleep(1000);   
			} catch (InterruptedException e) { 
				e.printStackTrace(); 
			} 
		} 
	} 
	public static void main(String[] args) { 
		Task1 t = new Task1(); 
		t.start(); 
	} 
} 