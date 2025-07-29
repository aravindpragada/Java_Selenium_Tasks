package com.java.casestudy.ECommerceApp;

public abstract class Payment {
    protected double amount;
    public Payment(double amount) { this.amount = amount; }
    public abstract void processPayment();
}
