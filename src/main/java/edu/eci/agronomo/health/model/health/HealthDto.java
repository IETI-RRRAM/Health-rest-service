package edu.eci.agronomo.health.model.health;

public class HealthDto {
    private String idRanch;
    private String name;
    private String type;
    private String gender;

    public HealthDto(String idRanch, String name, String type, String gender) {
        this.idRanch = idRanch;
        this.name = name;
        this.type = type;
        this.gender = gender;
    }

    public HealthDto() {

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
