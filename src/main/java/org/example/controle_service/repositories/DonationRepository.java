package org.example.controle_service.repositories;

import org.example.controle_service.entities.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepository extends JpaRepository<Donation, Long> {
}
