package com.projet.entites;

import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Table(name = "categorie")
@Data
public class Categorie extends Super {

    

    @NotBlank
    @Column(name = "nom", nullable = false)
    private String nom;

    @OneToMany(mappedBy = "categorie", cascade = CascadeType.ALL)
    private List<Article> articles;

    
}
