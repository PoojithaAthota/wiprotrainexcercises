package com.wipro.producer;

import com.wipro.model.Subject;
//import com.wipro.producer.service.MessageProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class ProducerApplication implements CommandLineRunner {
	
	@Autowired
    private KafkaTemplate<String, Subject> kafkaTemplate;

//    private final MessageProducer producer;
//
//    public ProducerApplication(MessageProducer producer) {
//        this.producer = producer;
//    }

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }

    @Override
    public void run(String... args) {
    	kafkaTemplate.send("learn-subject", new Subject("BE", "Spring Boot"));
        kafkaTemplate.send("learn-subject", new Subject("FE", "Angular"));
        System.out.println("Messages sent successfully");
    }
}

