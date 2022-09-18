package com.agropont.eruditserveur.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Gestionnaires {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idgest;
	
	@Column(length = 30)
	private String nom;
	
	@Column(length = 505)
	private String prenom;
	
	@Column(length = 12)
	private String telepone;
	
	private String courriel;
	
	private String password;
	
	private boolean actif;

}
