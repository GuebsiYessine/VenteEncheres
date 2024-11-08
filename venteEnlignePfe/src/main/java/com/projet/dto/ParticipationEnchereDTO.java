package com.projet.dto;

import lombok.Data;


@Data
public class ParticipationEnchereDTO extends SuperDTO {

    
    private UtilisateurDTO utilisateur;
    private EnchereDTO enchere;
    
    
}
