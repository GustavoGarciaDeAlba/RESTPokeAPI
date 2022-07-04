package com.arquitectura.pokeapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arquitectura.pokeapi.model.entities.Pokemon;
import com.arquitectura.pokeapi.model.services.PokeDAO;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {
	
	@Autowired
	private PokeDAO pokeDao;
	
	/**
	 * Endpoint that lists pokemons with a limit of 20
	 * @return returns a list of Pokemons
	 */
	@GetMapping("/all-pokemons")
	private ResponseEntity<?> getAllPokemons(){
		List<Pokemon> pokemons = pokeDao.getAll();
		return new ResponseEntity<List<Pokemon>>(pokemons, HttpStatus.OK);
	}
	
	/**
	 * Endpoint to get a pokemon by its ID 
	 * @param pokemonId 
	 * @return Returns a Pokemon object
	 */
	@GetMapping("/pokemonId/{pokemonId}")
	public ResponseEntity<?> getPokemonDetails(@PathVariable Long pokemonId){
		Pokemon pokemon = pokeDao.getById(pokemonId);
		return new ResponseEntity<Pokemon>(pokemon,HttpStatus.OK);	
	}
}
