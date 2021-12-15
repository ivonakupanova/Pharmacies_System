package dians.project.pharmacies.controller;

import dians.project.pharmacies.service.MunicipalitiesServiceImpl;
import dians.project.pharmacies.service.PharmaciesServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pharmacies")
public class PharmacyController {

    public final PharmaciesServiceImpl pharmaciesService;
    public final MunicipalitiesServiceImpl municipalitiesService;

    public PharmacyController(PharmaciesServiceImpl pharmaciesService, MunicipalitiesServiceImpl municipalitiesService) {
        this.pharmaciesService = pharmaciesService;
        this.municipalitiesService = municipalitiesService;
    }

    @GetMapping("/home")
    public String homePage(@RequestParam(required = false) String namePharmacy,
                           @RequestParam(required = false) String idMunicipality,
                           Model model) {
        if(namePharmacy != null)
            model.addAttribute("pharmacies", pharmaciesService.findByName(namePharmacy));
        if(idMunicipality != null)
            model.addAttribute("pharmacies", pharmaciesService.findByMunicipality(Long.parseLong(idMunicipality)));
        model.addAttribute("municipalities", municipalitiesService.findAll());
        return "homePage";
    }


    @GetMapping("/aboutUsPage")
    public String aboutUsPage() {

        return "aboutUsPage";
    }


}
