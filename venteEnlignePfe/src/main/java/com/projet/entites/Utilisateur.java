package com.projet.entites;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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

public  class Utilisateur extends BaseEntity {

    
	

    @Column( nullable = false)
    private String nom;

    @Column(name = "prenom", nullable = false)
    private String prenom;


    @Column( nullable = false, unique = true)
    private String email;

    @Column( nullable = false)
    private String motdepasse;

    
    @Column( nullable = false)
    private String numeroTel;

    @Enumerated(EnumType.STRING)
private Grade grade;
    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
  private List<Enchere> encheres;
    @OneToMany(mappedBy = "vendeur",fetch = FetchType.EAGER)
    private List<Article> articles;
    @OneToOne(mappedBy = "utilisateur")
    private Adresse adresse;
    @OneToMany(mappedBy = "utilisateur")
    private List<Participation> participations;
}
