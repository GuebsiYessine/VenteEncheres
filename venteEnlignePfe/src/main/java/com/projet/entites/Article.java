package com.projet.entites;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitialiser","handler"})
public class Article extends BaseEntity  {

    

    
    @Column(name = "titre", nullable = false)
    private String titre;

    
    @Column(name = "description", nullable = false)
    private String description;

    
    @Column(name = "quantiteStock", nullable = false)
    private int quantiteStock;

    
    @Column(name = "prixInitial", nullable = false)
    private double prixInitial;

    
    @Column(name = "prixVente")
    private double prixVente;

    
    @Column(name = "statut", nullable = false)
    private String statut;
    
    
    @ManyToOne(optional = false)
    
    private Utilisateur vendeur;

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    
    private List<Categorie> categories;
    
    @ManyToOne
    private Enchere enchere;

    // a verifier 
    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
    private List<Enchere> encheres;
}
