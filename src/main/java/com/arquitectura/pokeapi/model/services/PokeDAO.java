package com.arquitectura.pokeapi.model.services;

import java.util.List;

import com.arquitectura.pokeapi.model.entities.Pokemon;

public interface PokeDAO {
	public List<Pokemon> getAll();
	public Pokemon getById(Long id);
}
