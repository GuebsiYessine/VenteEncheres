package com.projet.entites;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "participation_enchere")
@Data
public class ParticipationEnchere {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "acheteur_id")
    private Acheteur acheteur;

    @ManyToOne
    @JoinColumn(name = "enchere_id")
    private Enchere enchere;

    /*@ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;
*/
    
}

