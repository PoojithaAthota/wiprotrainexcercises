package com.wipro.userservice.controller;

import com.wipro.userservice.dto.NotificationDto;
import com.wipro.userservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/users")
public class UserController {

    private final Map<Long, User> users = new HashMap<>();
    private final AtomicLong idCounter = new AtomicLong();

    @Autowired
    private RestTemplate restTemplate;

    private final String NOTIFY_URL = "http://localhost:8082/notify";

    @PostMapping
    public User createUser(@RequestBody User user) {
        long id = idCounter.incrementAndGet();
        user.setId(id);
        users.put(id, user);
        notify(user, "Created");
        return user;
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User newUser) {
        User existing = users.get(id);
        if (existing != null) {
            existing.setUsername(newUser.getUsername());
            existing.setPassword(newUser.getPassword());
            existing.setAddress(newUser.getAddress());
            notify(existing, "Updated");
            return ResponseEntity.ok(existing);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        User removed = users.remove(id);
        if (removed != null) {
            notify(removed, "Deleted");
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        User user = users.get(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.notFound().build();
    }

    private void notify(User user, String action) {
        NotificationDto dto = new NotificationDto();
        dto.setUser(user);
        dto.setAction(action);
        restTemplate.postForObject(NOTIFY_URL, dto, String.class);
    }
}
