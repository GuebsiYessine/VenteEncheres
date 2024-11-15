package com.projet.entites;

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
public class Categorie extends BaseEntity {

    

    @NotBlank
    @Column(name = "nom", nullable = false)
    private String nom;

    @ManyToMany(mappedBy = "categories")
    private List<Article> articles;

    
}
