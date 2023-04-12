package edu.eci.agronomo.health.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class HealthNotFoundException extends ResponseStatusException {

    public HealthNotFoundException(String id) {
        super(HttpStatus.NOT_FOUND, "Health with ID: " + id + " not found");
    }
}
