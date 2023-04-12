package edu.eci.agronomo.health.repository;

import edu.eci.agronomo.health.model.health.Health;
import edu.eci.agronomo.health.model.health.HealthDto;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Optional;

@Repository
public class HealthRepositoryImpl implements HealthRepository {

    @Autowired
    private final MongoTemplate mongoTemplate;

    public HealthRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public ArrayList<Health> findAll() {
        return (ArrayList<Health>) mongoTemplate.findAll(Health.class);
    }

    @Override
    public Optional<Health> findById(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        return Optional.ofNullable(mongoTemplate.findOne(query, Health.class));
    }

    @Override
    public Health save(HealthDto healthDto) {
        return mongoTemplate.save(new Health(String.valueOf(ObjectId.get()), healthDto));
    }

    @Override
    public void delete(String id) {
        mongoTemplate.remove(new Query(Criteria.where("id").is(id)), Health.class);
    }

    @Override
    public Health update(String id, HealthDto healthDto) {
        Query query = new Query(Criteria.where("id").is(id));
        Update update = new Update()
                .set("idAnimal", healthDto.getIdAnimal())
                .set("status", healthDto.getStatus())
                .set("treatments", healthDto.getTreatments())
                .set("meds", healthDto.getMeds())
                .set("alerts", healthDto.getAlerts());
        mongoTemplate.updateFirst(query, update, Health.class);
        return findById(id).orElse(null);
    }
}
