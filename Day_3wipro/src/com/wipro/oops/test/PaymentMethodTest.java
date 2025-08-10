package com.wipro.oops.test;

import com.wipro.oops.PaymentMethod;
import com.wipro.oops.Gpay;
import com.wipro.oops.Phonepay;

public class PaymentMethodTest {
	public static void main(String[] args) {
		PaymentMethod method;
		
		method = new Gpay();
		method.pay(5000);
		
		method = new Phonepay();
		method.pay(1000);
		
		
	}

}
