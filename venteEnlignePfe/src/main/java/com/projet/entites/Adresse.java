package com.projet.entites;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitialiser","handler"})

public class Adresse {

	@Id
	private long id;
    
    @Column(name = "codePostal")
    private int codePostal;

    @Column(name = "ville")
    private String ville;

    @Column(name = "pays")
    private String pays;
    @MapsId
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Utilisateur utilisateur;
}
