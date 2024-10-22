package com.projet.entites;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Acheteur extends Utilisateur {
	@OneToMany(mappedBy = "acheteur", cascade = CascadeType.ALL)
    private List<ParticipationEnchere> participations;

    public void passerCommande() {
        //  pour passer une commande
    }

    public void ecrireCommentaire() {
        //  pour écrire un commentaire
    }

    
}
