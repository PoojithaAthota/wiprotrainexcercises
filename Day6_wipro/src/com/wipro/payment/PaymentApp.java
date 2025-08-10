package com.wipro.payment;

public class PaymentApp {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.processPayment(new GooglePay(), 200);
        processor.processPayment(new PhonePay(), 700);
        processor.processPayment(new Paytm(), 1000);
    }
}

