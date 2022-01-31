package dians.project.pharmacies.pharmacy.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Pharmacy {
    @Id
    private long id;

    private String name;

    private double coordinatesLon;

    private double coordinatesLat;

    private String address;

    private String workingHours;

    @Column(name = "opstina_id")
    private Long municipalityId;


    public Pharmacy(){}

}
