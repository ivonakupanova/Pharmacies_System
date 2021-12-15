package dians.project.pharmacies.repository;

import dians.project.pharmacies.model.Municipality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MunicipalityRepository extends JpaRepository<Municipality, Long> {
    Municipality findMunicipalityByName(String name);
}
