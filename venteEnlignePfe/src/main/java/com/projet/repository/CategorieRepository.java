package com.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.entites.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
