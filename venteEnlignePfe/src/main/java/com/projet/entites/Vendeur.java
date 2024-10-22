package com.projet.entites;

import java.util.List;

import jakarta.persistence.*;



@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Vendeur extends Utilisateur {

	 @OneToMany(mappedBy = "vendeur", cascade = CascadeType.ALL)
	    private List<Article> articles;
    public void proposerArticle() {
        
    }
 public void rechercheArticle() {
        
    }
 public void consulterArticleEnVente() {
     
 }
 public void acheterArticle() {
     
 }
public void consulterEnchereEnCours() {
     
 }
}
