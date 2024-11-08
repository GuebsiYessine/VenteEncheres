package com.projet.mapper;

import com.projet.dto.VendeurDTO;
import com.projet.entites.Vendeur;

public class VendeurMapper extends SuperMapper {

    public static VendeurDTO toDTO(Vendeur vendeur) {
        if (vendeur == null) {
            return null;
        }
        VendeurDTO dto = new VendeurDTO();
        //super.mapSuperFields(vendeur, dto);
        dto.setNom(vendeur.getNom());
        dto.setPrenom(vendeur.getPrenom());
        dto.setEmail(vendeur.getEmail());
        return dto;
    }

    public static Vendeur toEntity(VendeurDTO dto) {
        if (dto == null) {
            return null;
        }
        Vendeur vendeur = new Vendeur();
       // super.mapSuperFields(dto, vendeur);
        vendeur.setNom(dto.getNom());
        vendeur.setPrenom(dto.getPrenom());
        vendeur.setEmail(dto.getEmail());
        return vendeur;
    }
}
