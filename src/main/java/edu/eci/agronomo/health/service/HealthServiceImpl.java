package edu.eci.agronomo.health.service;

import edu.eci.agronomo.health.model.health.Health;
import edu.eci.agronomo.health.model.health.HealthDto;
import edu.eci.agronomo.health.repository.HealthRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class HealthServiceImpl implements HealthService {

    @Autowired
    HealthRepositoryImpl healthRepository;

    @Override
    public ArrayList<Health> findAll() {
        return healthRepository.findAll();
    }

    @Override
    public Optional<Health> findById(String id) {
        return healthRepository.findById(id);
    }

    @Override
    public Optional<Health> findByIdAnimal(String id) {
        return healthRepository.findByIdAnimal(id);
    }


    @Override
    public Health save(HealthDto healthDto) {
        return healthRepository.save(healthDto);
    }

    @Override
    public void delete(String id) {
        healthRepository.delete(id);
    }

    @Override
    public Health update(String id, HealthDto healthDto) {
        return healthRepository.update(id, healthDto);
    }

}
