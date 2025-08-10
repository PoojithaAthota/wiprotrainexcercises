package com.wipro.payment;

public class Paytm implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Paytm");
    }
}

