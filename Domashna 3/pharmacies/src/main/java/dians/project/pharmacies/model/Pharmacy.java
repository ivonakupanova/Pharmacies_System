package dians.project.pharmacies.model;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Pharmacy {
    @Id
    public long id;

    public String name;

    public double coordinatesLon;

    public double coordinatesLat;

    public String address;

    public String workingHours;

    public Pharmacy(){}

    public Pharmacy(String name, double coordinatesLon, double coordinatesLat, String workingHours) {
        this.name = name;
        this.coordinatesLon = coordinatesLon;
        this.coordinatesLat = coordinatesLat;
        this.workingHours = workingHours;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCoordinatesLon() {
        return coordinatesLon;
    }

    public void setCoordinatesLon(double coordinatesLon) {
        this.coordinatesLon = coordinatesLon;
    }

    public double getCoordinatesLat() {
        return coordinatesLat;
    }

    public void setCoordinatesLat(double coordinatesLat) {
        this.coordinatesLat = coordinatesLat;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }
}
