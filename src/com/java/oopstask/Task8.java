package com.java.oopstask;

abstract class Appliance {
	abstract void turnOn();
}

interface Connectable {
	void connect();
}

class SmartTv extends Appliance implements Connectable{

	@Override
	public void connect() {
		System.out.println("Connect to the TV");
	}

	@Override
	void turnOn() {
		System.out.println("Turn on the TV");
	}
}

public class Task8 {
	public static void main(String[] args) {
		SmartTv tv = new SmartTv();
		tv.connect();
		tv.turnOn();
	}
}
