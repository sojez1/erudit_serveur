package com.agropont.eruditserveur.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Reponses {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idrep;
	
	@Column(columnDefinition = "TEXT")
	private String liberep;
	
	@ManyToOne
	private Questions question;
	
	private boolean juste;

}
