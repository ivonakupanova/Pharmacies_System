package dians.project.pharmacies.municipality.service;
import dians.project.pharmacies.municipality.model.Municipality;
import java.util.List;

public interface MunicipalityService {
    List<Municipality> findAll();
    Municipality findById(Long id);
}
