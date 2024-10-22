package com.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.entites.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}
