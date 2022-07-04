package com.arquitectura.pokeapi.model.entities;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AllPokemon implements Serializable{

	private List<Result> results;
	private static final long serialVersionUID = -8711392040378062152L;

}
