package edu.eci.agronomo.health.model.alert;

import edu.eci.agronomo.health.model.med.Med;
import edu.eci.agronomo.health.model.procedure.Procedure;
import edu.eci.agronomo.health.model.treatment.Treatment;

import java.util.Date;
import java.util.List;

public class Alert extends Procedure {
    private List<Med> meds;
    private List<Treatment> treatments;

    public Alert(String name, String description, Date startDate, Date endDate, List<Med> meds, List<Treatment> treatments) {
        super(name, description, startDate, endDate);
        this.meds = meds;
        this.treatments = treatments;
    }
}
