package com.wipro.payment_ms.service;

import com.wipro.payment_ms.entity.Payment;

public interface PaymentService {
    Payment savePayment(Payment payment);
}
