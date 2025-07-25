package com.java.oopstask;

public class Task3 {
	private int AccNo;
	private double balance;
	public int getAccNo() {
		return AccNo;
	}
	public void setAccNo(int accNo) {
		AccNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Task3(int accNo, double balance) {
		this.AccNo = accNo;
		this.balance = balance;
	}
	
	public void deposite(double amount) {
		balance+=amount;
	}
	public void withdrawal(double amount) {
		balance-=amount;
	}
	public double getBalanceAmount() {
		return balance;
	}
	public void displayInfo() {
        System.out.println("Account Number: " + AccNo);
        System.out.println("Balance: ₹" + balance);
    }
	
	public static void main(String[] args) {
		Task3 obj = new Task3(2092839279,100000.0);
		obj.displayInfo();
		obj.deposite(40000.0);
		System.out.println(obj.getBalanceAmount());
		obj.withdrawal(20000.0);
		System.out.println(obj.getBalanceAmount());
		
		
	}
}
