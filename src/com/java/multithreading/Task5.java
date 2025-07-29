package com.java.multithreading;

public class Task5 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Priority : "+ Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		Task5 t1 = new Task5();
		Task5 t2 = new Task5();
		Task5 t3 = new Task5();
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.setName("Low");
		t2.setName("Medium");
		t3.setName("High");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
