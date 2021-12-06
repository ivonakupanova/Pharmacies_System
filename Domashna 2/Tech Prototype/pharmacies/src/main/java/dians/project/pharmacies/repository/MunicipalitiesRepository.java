package dians.project.pharmacies.repository;

import dians.project.pharmacies.bootstrap.DataHolder;
import dians.project.pharmacies.model.Municipality;
import dians.project.pharmacies.model.Pharmacy;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MunicipalitiesRepository {
    public List<Municipality> findAll() { return DataHolder.municipalityList; }
    public Municipality findByName(String name)
    {
        return DataHolder.municipalityList.stream().filter(p->p.name.equals(name)).findFirst().get();
    }
}