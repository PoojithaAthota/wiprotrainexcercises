package com.wipro.payment;

public class GooglePay implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Google Pay.");
    }
}

