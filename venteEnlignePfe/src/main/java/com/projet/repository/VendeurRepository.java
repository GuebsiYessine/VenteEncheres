package com.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.entites.Vendeur;

public interface VendeurRepository extends JpaRepository<Vendeur, Long> {

}
