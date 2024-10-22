package com.projet.dto;

import java.util.Date;
import java.util.List;

import lombok.Data;
@Data
public class EnchereDTO {

    private int id;
    private Date dateFin;
    private Date dateDebut;
    private String statut;
    private List<ArticleDTO> articles;
    
    
}

