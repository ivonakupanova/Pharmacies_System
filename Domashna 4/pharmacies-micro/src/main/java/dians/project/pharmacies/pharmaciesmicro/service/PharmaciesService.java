package dians.project.pharmacies.pharmaciesmicro.service;


import dians.project.pharmacies.pharmaciesmicro.VO.ResponseTemplateVO;



public interface PharmaciesService {
    ResponseTemplateVO findAllMunicipalities();
    ResponseTemplateVO findByName(String name);
    ResponseTemplateVO findByMunicipality(Long id);
    ResponseTemplateVO findByMunicipalityApi(Long id);

}
