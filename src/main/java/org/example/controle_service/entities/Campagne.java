package org.example.controle_service.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Campagne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private BigDecimal objectifMontant;
    private LocalDate dateDebut;
    private LocalDate dateFin;

    // Nouveau champ 'active' pour indiquer si la campagne est active ou non
    private boolean active;

    // Getters et Setters si nécessaire (générés par Lombok @Data)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public BigDecimal getObjectifMontant() {
        return objectifMontant;
    }

    public void setObjectifMontant(BigDecimal objectifMontant) {
        this.objectifMontant = objectifMontant;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    // Ajout de la méthode pour le champ 'active'
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
