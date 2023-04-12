package edu.eci.agronomo.health.model.health;

import edu.eci.agronomo.health.model.alert.Alert;
import edu.eci.agronomo.health.model.med.Med;
import edu.eci.agronomo.health.model.treatment.Treatment;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Document(collection = "health_collection")
public class Health implements Serializable {

    @Id
    private String id;
    private String idAnimal;
    private String status;
    private List<Treatment> treatments;
    private List<Med> meds;
    private List<Alert> alerts;

    public Health(String id, String idAnimal, String status, List<Treatment> treatments, List<Med> meds, List<Alert> alerts) {
        this.id = id;
        this.idAnimal = idAnimal;
        this.status = status;
        this.treatments = treatments;
        this.meds = meds;
        this.alerts = alerts;
    }

    public Health(String idAnimal, String status, List<Treatment> treatments, List<Med> meds, List<Alert> alerts) {
        this.idAnimal = idAnimal;
        this.status = status;
        this.treatments = treatments;
        this.meds = meds;
        this.alerts = alerts;
    }

    public Health(String id, HealthDto healthDto) {
        this.id = id;
        this.idAnimal = healthDto.getIdAnimal();
        this.status = healthDto.getStatus();
        this.treatments = healthDto.getTreatments();
        this.meds = healthDto.getMeds();
        this.alerts = healthDto.getAlerts();
    }

    public Health() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(String idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Treatment> getTreatments() {
        return treatments;
    }

    public void setTreatments(List<Treatment> treatments) {
        this.treatments = treatments;
    }

    public List<Med> getMeds() {
        return meds;
    }

    public void setMeds(List<Med> meds) {
        this.meds = meds;
    }

    public List<Alert> getAlerts() {
        return alerts;
    }

    public void setAlerts(List<Alert> alerts) {
        this.alerts = alerts;
    }
}