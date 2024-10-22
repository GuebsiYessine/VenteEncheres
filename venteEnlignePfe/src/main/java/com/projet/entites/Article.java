package com.projet.entites;

import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @NotBlank
    @Column(name = "titre", nullable = false)
    private String titre;

    @NotBlank
    @Column(name = "description", nullable = false)
    private String description;

    @Min(1)
    @Column(name = "quantiteStock", nullable = false)
    private int quantiteStock;

    @NotNull
    @Column(name = "prixInitial", nullable = false)
    private double prixInitial;

    @NotNull
    @Column(name = "prixVente")
    private double prixVente;

    @NotNull
    @Column(name = "statut", nullable = false)
    private String statut;
    
    
    @ManyToOne
    @JoinColumn(name = "vendeur_id")
    private Vendeur vendeur;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;
    
    @ManyToOne
    @JoinColumn(name = "enchere_id")
    private Enchere enchere;

    // a verifier 
    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
    private List<Enchere> encheres;
}
