package com.arquitectura.pokeapi.model.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Pokemon implements Serializable{

	private Long id;
	private String name;
	private Integer baseExperience;
	private Integer height;
	private Integer weight;
	
	private static final long serialVersionUID = 3985698290921476465L;
}
