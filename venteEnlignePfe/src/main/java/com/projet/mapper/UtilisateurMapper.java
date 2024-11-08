package com.projet.mapper;

import com.projet.dto.UtilisateurDTO;
import com.projet.entites.Utilisateur;

public class UtilisateurMapper extends SuperMapper {

    public static UtilisateurDTO toDTO(Utilisateur utilisateur) {
        if (utilisateur == null) {
            return null;
        }
        UtilisateurDTO dto = new UtilisateurDTO();
        //super.mapSuperFields(utilisateur, dto);
        dto.setNom(utilisateur.getNom());
        dto.setPrenom(utilisateur.getPrenom());
        dto.setEmail(utilisateur.getEmail());
        return dto;
    }

    public static Utilisateur toEntity(UtilisateurDTO dto) {
        if (dto == null) {
            return null;
        }
        Utilisateur utilisateur = new Utilisateur();
        //super.mapSuperFields(dto, utilisateur);
        utilisateur.setNom(dto.getNom());
        utilisateur.setPrenom(dto.getPrenom());
        utilisateur.setEmail(dto.getEmail());
        return utilisateur;
    }
}

