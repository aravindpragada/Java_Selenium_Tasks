package com.java.multithreading;

class BankAccount{
	private int balance = 10000;
	synchronized void withdraw(int amount, String user) {
		if(balance >= amount) {
			System.out.println(user+ " is Withdrawing "+ amount);
			balance-= amount;
			System.out.println("Remaining Balanace :"+ balance);
		}else {
			System.out.println(user+" tried to withdrawal but insufficient funds...");
		}
	}
}

public class Task8 {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		Runnable user1 = ()-> account.withdraw(7000, "user1");
		Runnable user2 = ()-> account.withdraw(2000, "user2");
		
		new Thread(user1).start();
		new Thread(user2).start();
	}
}
