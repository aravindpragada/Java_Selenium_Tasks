package com.java.task;

public class Task7 {
	public static void main(String[] args) {
		int count=0;
		for(int num=2;count<10;num++) {
			boolean isPrime=true;
			
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}	
			if(isPrime) {
				System.out.print(num+ " ");
				count++;
			}
		}	
	}
}
