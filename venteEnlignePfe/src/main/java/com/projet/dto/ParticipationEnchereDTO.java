package com.projet.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParticipationEnchereDTO {

    private int id;
    private UtilisateurDTO utilisateur;
    private EnchereDTO enchere;

    
}
