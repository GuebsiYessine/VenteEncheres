package com.projet.dto;

import java.util.Date;
import java.util.List;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class EnchereDTO extends SuperDTO {

	 @NotBlank
    private Date dateFin;
	 @NotBlank
    private Date dateDebut;
	 @NotBlank
    private String statut;
    private List<ArticleDTO> articles;
    
    
}

