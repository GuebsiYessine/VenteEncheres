package com.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.entites.Administrateur;

public interface AdministrateurRepository extends JpaRepository<Administrateur, Long> {

}
