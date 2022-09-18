package com.agropont.eruditserveur.entites;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Categories {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcate;
	
	@Column(length = 50)
	private String libecate;
	
	@OneToMany(mappedBy = "categorie")
	private Collection<Questions> question;
	
	

}
