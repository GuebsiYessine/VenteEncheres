package com.projet.entites;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Administrateur extends Utilisateur {

    public void gererUtilisateurs() {
        //  pour gérer les utilisateurs
    }

    public void gererArticles() {
        // pour gérer les articles
    }

    public void gererCommentaires() {
        // pour gérer les commentaires
    }
    
    public void gererDemandeVentes() {
        // pour gérer les demande de ventes
    }
    @OneToMany(mappedBy = "administrateur", cascade = CascadeType.ALL)
    private List<Enchere> encheresPlanifiees;
}

