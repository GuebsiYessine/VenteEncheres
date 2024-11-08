package com.projet.entites;



import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table ( name = "utilisateur")
@Data
public  class Utilisateur extends Super {

    
	

    @NotBlank
    @Column(name = "nom", nullable = false)
    private String nom;

    @NotBlank
    @Column(name = "prenom", nullable = false)
    private String prenom;

    @Email
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @NotBlank
    @Size(min = 8)
    @Column(name = "motdepasse", nullable = false)
    private String motdepasse;

    @NotBlank
    @Column(name = "numeroTel", nullable = false)
    private String numeroTel;

    @Min(10000)
    @Max(99999)
    @Column(name = "codePostal")
    private int codePostal;

    @Column(name = "ville")
    private String ville;

    @Column(name = "pays")
    private String pays;


    // Méthodes communes qui seront utilisées par les sous-classes appropriées
    public void seConnecter() {
    
    
     
    }
      
    
    public void sInscrire() {
        
    }
    /*
    @OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL)
    private List<ParticipationEnchere> participations;
    */
}
