package dians.project.pharmacies.service;

import dians.project.pharmacies.model.Municipality;
import dians.project.pharmacies.repository.MunicipalitiesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MunicipalitiesServiceImpl implements MunicipalitiesService{
    public MunicipalitiesRepository municipalitiesRepository;
    public MunicipalitiesServiceImpl(MunicipalitiesRepository municipalitiesRepository)
    {
        this.municipalitiesRepository=municipalitiesRepository;
    }
    @Override
    public List<Municipality> findAll() {
        return municipalitiesRepository.findAll();
    }

    @Override
    public Municipality findByName(String name) {
        return municipalitiesRepository.findByName(name);
    }
}
