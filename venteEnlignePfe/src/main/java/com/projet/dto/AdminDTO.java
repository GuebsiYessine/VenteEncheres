package com.projet.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class AdminDTO {
    private Long id;

    @NotBlank(message = "Nom ne peut pas être vide")
    private String nom;
    
    @NotBlank(message = "Prenom ne peut pas être vide")
    private String prenom;
 
    @NotBlank(message = "Email ne peut pas être vide")
    private String email;

 
}

