package edu.eci.agronomo.health.model.treatment;

import edu.eci.agronomo.health.model.procedure.Procedure;

import java.util.Date;

public class Treatment extends Procedure {

    public Treatment(String name, String description, Date startDate, Date endDate) {
        super(name, description, startDate, endDate);
    }
}
