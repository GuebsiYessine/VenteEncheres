package com.projet.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UtilisateurDTO extends SuperDTO {

	 @NotBlank
	    private String nom;
	 @NotBlank
	    private String prenom;
	 @NotBlank
	    private String email;
	 @NotBlank
	    private String numeroTel;
	 @NotBlank
	    private String type;
	 @NotBlank
	    private String pays;
	 @NotBlank
	    private String ville;
	 @NotBlank
	    private String codePostal;
	 @NotBlank
	    private int cin;
    
}

