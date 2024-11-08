package com.projet.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class CategorieDTO {
	@NotBlank
    
    private String nom;
}
