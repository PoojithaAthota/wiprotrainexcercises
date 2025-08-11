package com.wipro.payment;

public class PaymentProcessor {
	
    public void processPayment(Payment payment, double amount) {
        payment.pay(amount);
    }
}

