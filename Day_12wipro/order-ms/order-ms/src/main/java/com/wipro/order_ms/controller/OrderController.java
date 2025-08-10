package com.wipro.order_ms.controller;
import com.wipro.order_ms.dto.Payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wipro.order_ms.entity.Order;
import com.wipro.order_ms.repo.OrderRepo;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderRepo orderRepository;

    private final RestTemplate restTemplate = new RestTemplate();

    @PostMapping
    public ResponseEntity<Order> placeOrder(@RequestBody Order order) {
        try {
            // Step 1: Set initial order status
            order.setOrderStatus("I");
            Order savedOrder = orderRepository.save(order);

            // Step 2: Prepare payment request
            Payment payment = new Payment();
            payment.setAmount(savedOrder.getOrderValue());
            payment.setOrderId(savedOrder.getId());
            payment.setPaymentDescription("Payment for Order: " + savedOrder.getOrderNumber());
            payment.setPaymentMode("UPI"); // hardcoded or pass in request

            // Step 3: Make payment API call
            String url = "http://localhost:9010/payment";
            ResponseEntity<Payment> response = restTemplate.postForEntity(url, payment, Payment.class);

            if (response.getStatusCode() == HttpStatus.OK && response.getBody().isPaymentStatus()) {
                savedOrder.setOrderStatus("P");
            } else {
                savedOrder.setOrderStatus("C");
            }

        } catch (Exception e) {
            order.setOrderStatus("C");
        }

        return ResponseEntity.ok(orderRepository.save(order));
    }
}
