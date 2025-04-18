/*package org.example.controle_service.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class DonDTO {
    private Long id;

    private String nomCampagne;

    private String nomDonateur;

    private BigDecimal montant;
    private LocalDate date;
}*/
package org.example.controle_service.dto;

import jakarta.validation.constraints.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class DonDTO {

    private Long id;

    @NotBlank(message = "Le nom de la campagne ne doit pas être vide")
    private String nomCampagne;

    @NotBlank(message = "Le nom du donateur est obligatoire")
    private String nomDonateur;

    @Email(message = "Le format de l’email est invalide")
    private String email;

    @DecimalMin(value = "0.01", message = "Le montant doit être supérieur à 0")
    private BigDecimal montant;

    @NotNull(message = "La date est obligatoire")
    private LocalDate date;
}
