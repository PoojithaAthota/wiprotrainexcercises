package com.wipro.payment_ms.controller;

import com.wipro.payment_ms.entity.Payment;
import com.wipro.payment_ms.repo.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentRepository paymentRepository;

    @PostMapping
    public ResponseEntity<Payment> doPayment(@RequestBody Payment payment) {
        payment.setPaymentStatus(true); // always success for now
        Payment savedPayment = paymentRepository.save(payment);
        return new ResponseEntity<>(savedPayment, HttpStatus.OK);
    }
}
