package dians.project.pharmacies.model;

import lombok.Data;

@Data
public class Municipality {
    public String name;
    public double coordinatesLon;
    public double coordinatesLat;

    public Municipality(String name, double coordinatesLon, double coordinatesLat) {
        this.name = name;
        this.coordinatesLon = coordinatesLon;
        this.coordinatesLat = coordinatesLat;
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
}
