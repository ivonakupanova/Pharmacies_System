package dians.project.pharmacies.controller;

import dians.project.pharmacies.repository.MunicipalitiesRepository;
import dians.project.pharmacies.service.MunicipalitiesServiceImpl;
import dians.project.pharmacies.service.PharmaciesService;
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
    public String homePage(@RequestParam(required = false) String namePharmacy, Model model) {

        model.addAttribute("pharmacies", pharmaciesService.findByName(namePharmacy));
        model.addAttribute("municipalities", municipalitiesService.findAll());
        return "homePage";
    }


    @GetMapping("/aboutUsPage")
    public String aboutUsPage() {

        return "aboutUsPage";
    }


}
