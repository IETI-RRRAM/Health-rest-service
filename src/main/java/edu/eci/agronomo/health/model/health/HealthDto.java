package edu.eci.agronomo.health.model.health;

import edu.eci.agronomo.health.model.alert.Alert;
import edu.eci.agronomo.health.model.med.Med;
import edu.eci.agronomo.health.model.treatment.Treatment;

import java.util.List;

public class HealthDto {
    private String idAnimal;
    private String status;
    private List<Treatment> treatments;
    private List<Med> meds;
    private List<Alert> alerts;

    public HealthDto(String idAnimal, String status, List<Treatment> treatments, List<Med> meds, List<Alert> alerts) {
        this.idAnimal = idAnimal;
        this.status = status;
        this.treatments = treatments;
        this.meds = meds;
        this.alerts = alerts;
    }

    public HealthDto() {

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
