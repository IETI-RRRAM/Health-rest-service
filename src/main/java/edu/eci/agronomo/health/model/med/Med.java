package edu.eci.agronomo.health.model.med;

import edu.eci.agronomo.health.model.procedure.Procedure;

import java.util.Date;

public class Med extends Procedure {
    private String dose;

    public Med(String name, String description, Date startDate, Date endDate, String dose) {
        super(name, description, startDate, endDate);
        this.dose = dose;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }
}
