/*package org.example.controle_service.services;

import org.example.controle_service.dto.DonDTO;
import org.example.controle_service.entities.Campagne;
import org.example.controle_service.entities.Donation;
import org.example.controle_service.repositories.CampagneRepository;
import org.example.controle_service.repositories.DonationRepository;
import org.springframework.stereotype.Service;

@Service
public class ServiceDon {

    private final DonationRepository donationRepository;
    private final CampagneRepository campagneRepository;

    public ServiceDon(DonationRepository donationRepository, CampagneRepository campagneRepository) {
        this.donationRepository = donationRepository;
        this.campagneRepository = campagneRepository;
    }

    public void enregistrerDon(DonDTO donDTO) {
        Campagne campagne = campagneRepository.findById(donDTO.getId())
                .orElseThrow(() -> new RuntimeException("Campagne introuvable"));
        Donation donation = new Donation();
        donation.setCampagne(campagne);
        donation.setNomDonateur(donDTO.getNomDonateur());
        donation.setMontant(donDTO.getMontant());
        donation.setDate(donDTO.getDate());

        donationRepository.save(donation);
    }
}
*/
package org.example.controle_service.services;

import org.example.controle_service.dto.DonDTO;
import org.example.controle_service.entities.Campagne;
import org.example.controle_service.entities.Donation;
import org.example.controle_service.repositories.CampagneRepository;
import org.example.controle_service.repositories.DonationRepository;
import org.springframework.stereotype.Service;
import jakarta.validation.Valid;
@Service
public class ServiceDon {

    private final DonationRepository donationRepository;
    private final CampagneRepository campagneRepository;

    public ServiceDon(DonationRepository donationRepository, CampagneRepository campagneRepository) {
        this.donationRepository = donationRepository;
        this.campagneRepository = campagneRepository;
    }



    public void enregistrerDon(@Valid DonDTO donDTO) {
        Campagne campagne = campagneRepository.findById(donDTO.getId())
                .orElseThrow(() -> new RuntimeException("Campagne introuvable"));

        Donation donation = new Donation();
        donation.setCampagne(campagne);
        donation.setNomDonateur(donDTO.getNomDonateur());
        donation.setMontant(donDTO.getMontant());
        donation.setDate(donDTO.getDate());

        donationRepository.save(donation);
    }
}