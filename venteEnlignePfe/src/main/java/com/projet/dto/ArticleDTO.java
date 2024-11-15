package com.projet.dto;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ArticleDto {

    

    
    private String titre;

    

    private String description;

    

    private int quantiteStock;

    
 
    private double prixInitial;

    
 
    private double prixVente;

    
 
    private String statut;
    
    
 
    @JsonIgnoreProperties("article")
    private UtilisateurDto vendeur;

 
    
}
