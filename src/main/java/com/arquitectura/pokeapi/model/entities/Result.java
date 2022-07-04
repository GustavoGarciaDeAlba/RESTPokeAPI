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
public class Result implements Serializable{

	private String name;
	private String url;
	
	private static final long serialVersionUID = 2967710960706712521L;

}
