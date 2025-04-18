package org.example.controle_service.dto;

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
}
