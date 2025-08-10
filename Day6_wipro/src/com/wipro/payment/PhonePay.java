package com.wipro.payment;

public class PhonePay implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PhonePe.");
    }
}
