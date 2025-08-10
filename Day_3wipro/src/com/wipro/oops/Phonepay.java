package com.wipro.oops;

public class Phonepay implements PaymentMethod {

    public void pay(double amount) {
        System.out.println("Phonepay amount :"+amount);
    }
}
