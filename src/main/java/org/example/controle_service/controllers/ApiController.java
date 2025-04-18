package org.example.controle_service.controllers;

import org.example.controle_service.dto.DonDTO;
import org.example.controle_service.projections.CampagneResume;
import org.example.controle_service.services.ServiceCampagne;
import org.example.controle_service.services.ServiceDon;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    private final ServiceCampagne serviceCampagne;
    private final ServiceDon serviceDon;

    public ApiController(ServiceCampagne serviceCampagne, ServiceDon serviceDon) {
        this.serviceCampagne = serviceCampagne;
        this.serviceDon = serviceDon;
    }

    @GetMapping("/campagnes/actives")
    public List<CampagneResume> getCampagnesActives() {
        return serviceCampagne.getCampagnesActives();
    }

    @PostMapping("/campagnes/{id}/dons")
    public void enregistrerDon(@PathVariable Long id, @RequestBody DonDTO donDTO) {
        donDTO.setId(id);
        serviceDon.enregistrerDon(donDTO);
    }
}