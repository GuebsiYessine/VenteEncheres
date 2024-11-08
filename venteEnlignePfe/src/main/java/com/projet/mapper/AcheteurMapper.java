package com.projet.mapper;

import com.projet.dto.AcheteurDTO;
import com.projet.entites.Acheteur;

public class AcheteurMapper extends SuperMapper {

    public static AcheteurDTO toDTO(Acheteur acheteur) {
        if (acheteur == null) {
            return null;
        }
        AcheteurDTO dto = new AcheteurDTO();
        //super.mapSuperFields(acheteur, dto); // Mapper les champs communs
        dto.setNom(acheteur.getNom());
        dto.setPrenom(acheteur.getPrenom());
        dto.setEmail(acheteur.getEmail());
        return dto;
    }

    public static Acheteur toEntity(AcheteurDTO dto) {
        if (dto == null) {
            return null;
        }
        Acheteur acheteur = new Acheteur();
        //super.mapSuperFields(dto, acheteur); // Mapper les champs communs
        acheteur.setNom(dto.getNom());
        acheteur.setPrenom(dto.getPrenom());
        acheteur.setEmail(dto.getEmail());
        return acheteur;
    }
}
