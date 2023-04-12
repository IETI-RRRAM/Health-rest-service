package edu.eci.agronomo.health.service;

import edu.eci.agronomo.health.model.health.Health;
import edu.eci.agronomo.health.model.health.HealthDto;

import java.util.ArrayList;
import java.util.Optional;

public interface HealthService {

    public ArrayList<Health> findAll();

    public Optional<Health> findById(String id);

    public Health save(HealthDto healthDto);

    public void delete(String id);

    public Health update(String id, HealthDto healthDto);
}
