package com.projet.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArticleDTO {

    private int id;
    private String titre;
    private String description;
    private int quantiteStock;
    private double prixInitial;
    private double prixVente;
    private String statut;
    
    
}

