package com.wipro.payment_ms.repo;

import com.wipro.payment_ms.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}

