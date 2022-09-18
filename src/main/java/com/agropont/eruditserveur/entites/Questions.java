package com.agropont.eruditserveur.entites;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Questions {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idquest;
	
	@Column(columnDefinition = "TEXT")
	private String libequest;
	
	@ManyToOne
	private Categories categorie;
	
	@OneToMany(mappedBy = "question",fetch = FetchType.EAGER)
	private Collection<Reponses> reponse = new ArrayList<>();

}
