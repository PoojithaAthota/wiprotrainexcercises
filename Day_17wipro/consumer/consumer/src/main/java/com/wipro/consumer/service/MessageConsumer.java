package com.wipro.consumer.service;

//import com.wipro.model.Subject;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    @KafkaListener(topics = "learn-subject", groupId = "learn-group")
    public void consume(String message) {
        System.out.println("Consumer Received: " + message);
    }
}

