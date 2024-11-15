package com.projet.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.projet.entites.Grade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UtilisateurDto {

    private String nom;


    private String prenom;



    private String email;


    private String motdepasse;

    

    private String numeroTel;


private Grade grade;


	@JsonIgnoreProperties("vendeur")
    private List<ArticleDto> articles;

}
