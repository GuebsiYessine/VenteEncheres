package com.projet.mapper;

import com.projet.dto.CategorieDTO;
import com.projet.entites.Categorie;

public class CategorieMapper extends SuperMapper {

    public static CategorieDTO toDTO(Categorie categorie) {
        if (categorie == null) {
            return null;
        }
        CategorieDTO dto = new CategorieDTO();
       // super.mapSuperFields(categorie, dto);
        dto.setNom(categorie.getNom());
        return dto;
    }

    public static Categorie toEntity(CategorieDTO dto) {
        if (dto == null) {
            return null;
        }
        Categorie categorie = new Categorie();
        //super.mapSuperFields(dto, categorie);
        categorie.setNom(dto.getNom());
        return categorie;
    }
}
