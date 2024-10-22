package com.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.entites.Acheteur;

public interface AcheteurRepository extends JpaRepository<Acheteur, Long> {
    // Méthodes spécifiques à Acheteur si nécessaire
}

