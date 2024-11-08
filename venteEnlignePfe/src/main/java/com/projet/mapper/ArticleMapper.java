package com.projet.mapper;

import com.projet.dto.ArticleDTO;
import com.projet.entites.Article;


public class ArticleMapper extends SuperMapper {

    public static ArticleDTO toDTO(Article article) {
        if (article == null) {
            return null;
        }
        ArticleDTO dto = new ArticleDTO();
        //super.mapSuperFields(article, dto);
        dto.setTitre(article.getTitre());
        dto.setDescription(article.getDescription());
        dto.setPrixInitial(article.getPrixInitial());
        
        return dto;
    }

    public static Article toEntity(ArticleDTO dto) {
        if (dto == null) {
            return null;
        }
        Article article = new Article();
        //super.mapSuperFields(dto, article);
        article.setTitre(dto.getTitre());
        article.setDescription(dto.getDescription());
        article.setPrixInitial(dto.getPrixInitial());
        
        return article;
    }
}

