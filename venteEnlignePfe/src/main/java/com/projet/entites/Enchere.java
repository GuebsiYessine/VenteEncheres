package com.projet.entites;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
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
public class Enchere extends BaseEntity {

    

    
    
    private LocalDateTime dateDebut;

   
    private LocalDateTime dateFin;

   /*@ManyToOne(mappedBy = "enchere")
    private Set<Article> articles;*/
    
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article; 
    @ManyToMany(mappedBy = "encheres")
private List<Utilisateur> participants;
    @Enumerated(EnumType.STRING)
    private Etat etat;
    private double montantDepart;
    @OneToMany(mappedBy = "enchere")
    private List<Participation> participations;
    
}
