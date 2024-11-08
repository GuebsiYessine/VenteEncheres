package com.projet.mapper;

import com.projet.dto.ParticipationEnchereDTO;
import com.projet.entites.ParticipationEnchere;

public class participationEnchereMapper extends SuperMapper {

    public static ParticipationEnchereDTO toDTO(ParticipationEnchere participationEnchere) {
        if (participationEnchere == null) {
            return null;
        }
        ParticipationEnchereDTO dto = new ParticipationEnchereDTO();
        dto.setId(participationEnchere.getId()); // hérité de la classe Super
        dto.setUtilisateur(UtilisateurMapper.toDTO(participationEnchere.getUtilisateur())); // conversion via UtilisateurMapper
        dto.setEnchere(EnchereMapper.toDTO(participationEnchere.getEnchere())); // conversion via EnchereMapper
        dto.setCreatedAt(participationEnchere.getCreatedAt()); // hérité de Super
        dto.setUpdatedAt(participationEnchere.getUpdateAt()); // hérité de Super

        return dto;
    }

    public static ParticipationEnchere toEntity(ParticipationEnchereDTO participationEnchereDTO) {
        if (participationEnchereDTO == null) {
            return null;
        }

        ParticipationEnchere participationEnchere = new ParticipationEnchere();
        participationEnchere.setId(participationEnchereDTO.getId()); // hérité de Super
        participationEnchere.setUtilisateur(UtilisateurMapper.toEntity(participationEnchereDTO.getUtilisateur())); // conversion via UtilisateurMapper
        participationEnchere.setEnchere(EnchereMapper.toEntity(participationEnchereDTO.getEnchere())); // conversion via EnchereMapper
        participationEnchere.setCreatedAt(participationEnchereDTO.getCreatedAt()); // hérité de Super
        participationEnchere.setUpdateAt(participationEnchereDTO.getUpdatedAt()); // hérité de Super

        return participationEnchere;
    }
}

