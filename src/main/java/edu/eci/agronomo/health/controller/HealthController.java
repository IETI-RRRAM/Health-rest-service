package edu.eci.agronomo.health.controller;

import edu.eci.agronomo.health.exceptions.HealthNotFoundException;
import edu.eci.agronomo.health.model.health.Health;
import edu.eci.agronomo.health.model.health.HealthDto;
import edu.eci.agronomo.health.service.HealthServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/health")
public class HealthController {

    @Autowired
    private HealthServiceImpl healthService;

    // Get all healths
    @GetMapping
    public List<Health> getAllHealths() {
        return healthService.findAll();
    }

    // Get health by ID
    @GetMapping("/{id}")
    public ResponseEntity<Health> getHealthById(@PathVariable String id) {
        Optional<Health> health = healthService.findById(id);
        if (health.isPresent()) {
            return ResponseEntity.ok(health.get());
        } else {
            throw new HealthNotFoundException(id);
        }
    }

    // Create a new health
    @PostMapping
    public ResponseEntity<Health> createHealth(@RequestBody HealthDto healthDto) {
        Health createdHealth = healthService.save(healthDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdHealth);
    }

    // Delete an health
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHealth(@PathVariable String id) {
        Optional<Health> health = healthService.findById(id);
        if (health.isPresent()) {
            healthService.delete(health.get().getId());
            return ResponseEntity.ok().build();
        } else {
            throw new HealthNotFoundException(id);
        }
    }

    //update a health
    @PutMapping("/{id}")
    public ResponseEntity<Health> updateHealth(@PathVariable String id, @RequestBody HealthDto updatedHealth) {
        Optional<Health> health = healthService.findById(id);
        if (health.isPresent()) {
            Health savedHealth = healthService.update(id, updatedHealth);
            return ResponseEntity.ok(savedHealth);
        } else {
            throw new HealthNotFoundException(id);
        }
    }
}
