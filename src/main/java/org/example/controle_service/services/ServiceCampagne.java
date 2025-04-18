package org.example.controle_service.services;

import org.example.controle_service.entities.Campagne;
import org.example.controle_service.projections.CampagneResume;
import org.example.controle_service.repositories.CampagneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCampagne {

    private final CampagneRepository campagneRepository;

    // Constructeur pour injecter CampagneRepository
    public ServiceCampagne(CampagneRepository campagneRepository) {
        this.campagneRepository = campagneRepository;
    }

    // Méthode pour récupérer les campagnes actives
    public List<CampagneResume> getCampagnesActives() {
        // Utilisation de la méthode findCampagnesActives pour récupérer les données sous forme de projection
        return campagneRepository.findCampagnesActives();
    }

    // Méthode pour ajouter une nouvelle campagne
    public Campagne ajouterCampagne(Campagne campagne) {
        return campagneRepository.save(campagne);  // Sauvegarde la campagne dans la base de données
    }
}
