package com.projet.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AcheteurDTO extends UtilisateurDTO {
    

    @NotBlank(message = "Nom ne peut pas être vide")
    private String nom;

    @NotBlank(message = "Email ne peut pas être vide")
    private String email;

    // Getters et Setters
}

