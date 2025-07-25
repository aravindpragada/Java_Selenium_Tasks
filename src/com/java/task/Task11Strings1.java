package com.java.task;

import java.util.Scanner;

public class Task11Strings1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Name : ");
		String name = sc.nextLine();
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(3));
	}

}
