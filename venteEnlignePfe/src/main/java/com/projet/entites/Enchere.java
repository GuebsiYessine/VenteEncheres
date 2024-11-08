package com.projet.entites;

import java.util.Date;
import java.util.List;
import java.util.Set;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
@Data
@Entity
@Table(name = "enchere")

public class Enchere extends Super {

    

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date dateDebut;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date dateFin;

   /*@ManyToOne(mappedBy = "enchere")
    private Set<Article> articles;*/
    
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article; 

    @OneToMany(mappedBy = "enchere", cascade = CascadeType.ALL)
    private List<ParticipationEnchere> participations;
    
    
}
