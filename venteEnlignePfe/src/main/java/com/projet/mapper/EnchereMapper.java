package com.projet.mapper;

import com.projet.dto.EnchereDTO;
import com.projet.entites.Enchere;

public class EnchereMapper extends SuperMapper {

    public static EnchereDTO toDTO(Enchere enchere) {
        if (enchere == null) {
            return null;
        }
        EnchereDTO dto = new EnchereDTO();
       //super.mapSuperFields(enchere, dto);
        dto.setId(enchere.getId());
        dto.setDateDebut(enchere.getDateDebut());
        dto.setDateFin(enchere.getDateFin());
        return dto;
    }

    public static Enchere toEntity(EnchereDTO dto) {
        if (dto == null) {
            return null;
        }
        Enchere enchere = new Enchere();
       // super.mapSuperFields(dto, enchere);
        enchere.setId(dto.getId());
        enchere.setDateDebut(dto.getDateDebut());
        enchere.setDateFin(dto.getDateFin());
        return enchere;
    }
}

