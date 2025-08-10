package com.wipro.letsgo.controller;

import com.wipro.letsgo.entity.VehicleMovement;
import com.wipro.letsgo.repository.VehicleMovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
public class MovementController {

    @Autowired
    private VehicleMovementRepository repository;

    @PostMapping("/move")
    public String recordMovement(@RequestBody VehicleMovement movement) {
        movement.setMovementTime(LocalDateTime.now());
        repository.save(movement);
        return "Vehicle movement recorded successfully!";
    }
}
