package dians.project.pharmacies.service;

import dians.project.pharmacies.model.Pharmacy;
import dians.project.pharmacies.repository.PharmaciesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PharmaciesServiceImpl implements PharmaciesService {
    public final PharmaciesRepository pharmaciesRepository;
    public PharmaciesServiceImpl(PharmaciesRepository pharmaciesRepository)
    {
        this.pharmaciesRepository=pharmaciesRepository;
    }

    @Override
    public List<Pharmacy> findAll() {
        return pharmaciesRepository.findAll();
    }

    @Override
    public List<Pharmacy> findByName(String name) {
        return pharmaciesRepository.findByName(name);
    }


}
