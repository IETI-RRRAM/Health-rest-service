package edu.eci.agronomo.health.model.health;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "health_collection")
public class Health implements Serializable {

    @Id
    private String id;
    private String idRanch;
    private String name;
    private String type;
    private String gender;

    public Health(String id, String idRanch, String name, String type, String gender) {
        this.id = id;
        this.idRanch = idRanch;
        this.name = name;
        this.type = type;
        this.gender = gender;
    }

    public Health(String idRanch, String name, String type, String gender) {
        this.idRanch = idRanch;
        this.name = name;
        this.type = type;
        this.gender = gender;
    }

    public Health(String id, HealthDto healthDto) {
        this.id = id;
        this.idRanch = healthDto.getIdRanch();
        this.name = healthDto.getName();
        this.type = healthDto.getType();
        this.gender = healthDto.getGender();
    }

    public Health() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdRanch() {
        return idRanch;
    }

    public void setIdRanch(String idRanch) {
        this.idRanch = idRanch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}