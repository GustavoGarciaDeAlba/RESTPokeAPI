package com.arquitectura.pokeapi.model.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.arquitectura.pokeapi.model.entities.AllPokemon;
import com.arquitectura.pokeapi.model.entities.Pokemon;
import com.arquitectura.pokeapi.model.entities.Result;

@Service
public class PokeDAOImpl implements PokeDAO{
	
	@Autowired
	private RestTemplate clienteRest;
	
	@Override
	public List<Pokemon> getAll() {
		AllPokemon allPokemons = clienteRest.getForObject("https://pokeapi.co/api/v2/pokemon/", AllPokemon.class);
		List<Pokemon> pokeList = new ArrayList<>();
		for(Result r: allPokemons.getResults()) {
			pokeList.add(clienteRest.getForObject(r.getUrl(), Pokemon.class));
		}
		System.out.println(pokeList);
		return pokeList;
	}

	@Override
	public Pokemon getById(Long id) {
		Map<String, String> variables = new HashMap<String, String>();
		variables.put("id", id.toString());
		Pokemon pokemon = clienteRest.getForObject("https://pokeapi.co/api/v2/pokemon/{id}", Pokemon.class, variables);
		return pokemon;
	}

}
