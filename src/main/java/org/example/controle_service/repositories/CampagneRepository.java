package org.example.controle_service.repositories;

import org.example.controle_service.entities.Campagne;
import org.example.controle_service.projections.CampagneResume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CampagneRepository extends JpaRepository<Campagne, Long> {

    @Query("SELECT c.id as id, c.nom as nom, c.objectifMontant as objectifMontant FROM Campagne c WHERE c.dateFin > CURRENT_DATE")
    List<CampagneResume> findCampagnesActives();

}
