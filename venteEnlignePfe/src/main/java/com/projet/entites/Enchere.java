package com.projet.entites;

import java.util.Date;
import java.util.List;
import java.util.Set;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Table(name = "enchere")
@Data
public class Enchere {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date dateDebut;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date dateFin;

    @OneToMany(mappedBy = "enchere")
    private Set<Article> articles;
    // a verifier 
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    @OneToMany(mappedBy = "enchere", cascade = CascadeType.ALL)
    private List<ParticipationEnchere> participations;
    
    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Administrateur administrateur;
}
