package com.java.oopstask;

class Calculator{
	int add(int x, int y) {
		int res = x + y;
		return res;
	}
	double add(double x, double y) {
		double res = x + y;
		return res;
	}
	String add( String x, String y) {
		String res = x + y;
		return res;
	}
}
public class Task6 {
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(10.0, 14.0));
		System.out.println(obj.add("Aravind", "Pragada"));
	}
}
