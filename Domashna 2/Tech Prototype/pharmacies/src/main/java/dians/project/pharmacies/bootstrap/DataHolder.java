package dians.project.pharmacies.bootstrap;

import dians.project.pharmacies.model.Municipality;
import dians.project.pharmacies.model.Pharmacy;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Data
public class DataHolder {
    public static List<Municipality> municipalityList = new ArrayList<>();
    public static List<Pharmacy> pharmaciesList = new ArrayList<>();
    @PostConstruct
    public void init() {
        municipalityList.add(new Municipality("Centar",21.4302548,41.9942467));
        pharmaciesList.add(new Pharmacy("Zegin",21.4273351,41.9918820,"24/7"));
        pharmaciesList.add(new Pharmacy("Uni medikal",21.4226797,41.9984708,"24/7"));
    }

}
