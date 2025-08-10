package com.wipro.logdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    private static final Logger logger = LoggerFactory.getLogger(GreetController.class);

    @GetMapping("/greet")
    public String greet() {
        logger.trace("This is a TRACE log message");
        logger.debug("This is a DEBUG log message");
        logger.info("This is an INFO log message");
        logger.warn("This is a WARN log message");
        logger.error("This is an ERROR log message");
        return "Hello! Check the logs.";
    }
}
