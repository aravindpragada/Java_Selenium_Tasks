package com.java.task;

import java.util.Scanner;

public class Task10Arrays2 {
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3x3 Matrix : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Original Matrix...");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n Transpose Matrix...");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}
	}
}
