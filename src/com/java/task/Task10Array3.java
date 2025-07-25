package com.java.task;

import java.util.Scanner;

public class Task10Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Elements : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter "+n+" integer numbers :");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted arrays:");
		for(int values:arr) {
			System.out.println(values+" ");
		}
		sc.close();
	}
}
