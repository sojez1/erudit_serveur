package com.agropont.eruditserveur.entites;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Categories {
	
	private Long idcate;
	private String libecate;
	
	

}
