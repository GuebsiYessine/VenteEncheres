package com.projet.mapper;

import org.modelmapper.ModelMapper;

import com.projet.dto.UtilisateurDto;
import com.projet.entites.Utilisateur;


public class UtilisateurMapper {
	private static final ModelMapper modelMapper= new ModelMapper();
	public static UtilisateurDto convertToDTO(Utilisateur utilisateur)
	{
	return modelMapper.map(utilisateur, UtilisateurDto.class);
	}

	public static Utilisateur convertToEntity(UtilisateurDto utilisateurDTO)
	{
	return modelMapper.map(utilisateurDTO, Utilisateur.class);	
	}

}
