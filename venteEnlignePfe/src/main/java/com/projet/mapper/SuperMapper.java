package com.projet.mapper;

import java.util.Date;

import com.projet.dto.SuperDTO;
import com.projet.entites.Super;




public class SuperMapper {

    protected void mapSuperFields(Super source, SuperDTO target) {
        target.setId(source.getId());
        target.setCreatedAt(source.getCreatedAt());
        target.setUpdatedAt(source.getUpdateAt()); 
    }

    protected void mapSuperFields(SuperDTO source, Super target) {
        target.setId(source.getId());
        target.setCreatedAt(source.getCreatedAt() != null ? source.getCreatedAt() : new Date());
        target.setUpdateAt(source.getUpdatedAt() != null ? source.getUpdatedAt() : new Date()); 
    }
}

