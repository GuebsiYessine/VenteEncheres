package com.projet.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class ArticleDTO extends SuperDTO {

	 @NotBlank
    private String titre;
	 @NotBlank
    private String description;
	 @NotBlank
    private int quantiteStock;
	 @NotBlank
    private double prixInitial;
	 @NotBlank
    private double prixVente;
	 @NotBlank
    private String statut;
	
	
	}
    
    

