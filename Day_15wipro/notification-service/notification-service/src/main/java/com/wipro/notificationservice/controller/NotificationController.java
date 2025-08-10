package com.wipro.notificationservice.controller;

import com.wipro.notificationservice.dto.NotificationDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notify")
public class NotificationController {

    @PostMapping
    public ResponseEntity<String> notify(@RequestBody NotificationDto dto) {
    	String username = dto.getUser().getUsername();
        String action = dto.getAction();
        System.out.println("User: " + username + " | Action: " + action);
        return ResponseEntity.ok("User " + dto.getUser().getUsername() + " information is " + dto.getAction());    }
}

