package dians.project.pharmacies.repository;

import dians.project.pharmacies.bootstrap.DataHolder;
import dians.project.pharmacies.model.Pharmacy;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PharmaciesRepository {
    public List<Pharmacy> findAll() { return DataHolder.pharmaciesList; }
    public List<Pharmacy> findByName(String name)
    {
        return DataHolder.pharmaciesList.stream().filter(p->p.name.equals(name)).collect(Collectors.toList());
    }
}
