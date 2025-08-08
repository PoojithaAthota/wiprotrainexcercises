package com.wipro.letsgo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "vehicle_movement")
public class VehicleMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "vehicle_id")
    private Integer vehId;

    @Column(name = "latitude")
    private Double lat;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "movement_time")
    private LocalDateTime movementTime;

    public VehicleMovement() {}

    public VehicleMovement(Integer vehId, Double lat, Double longitude, LocalDateTime movementTime) {
        this.vehId = vehId;
        this.lat = lat;
        this.longitude = longitude;
        this.movementTime = movementTime;
    }

    // Getters and setters
    public Long getId() { return id; }
    public Integer getVehId() { return vehId; }
    public void setVehId(Integer vehId) { this.vehId = vehId; }
    public Double getLat() { return lat; }
    public void setLat(Double lat) { this.lat = lat; }
    public Double getLongitude() { return longitude; }
    public void setLongitude(Double longitude) { this.longitude = longitude; }
    public LocalDateTime getMovementTime() { return movementTime; }
    public void setMovementTime(LocalDateTime movementTime) { this.movementTime = movementTime; }
}

