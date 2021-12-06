package dians.project.pharmacies.service;

import dians.project.pharmacies.model.Municipality;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MunicipalitiesService {
    List<Municipality> findAll();
    Municipality findByName(String name);
}
