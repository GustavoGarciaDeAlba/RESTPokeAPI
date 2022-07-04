package com.arquitectura.pokeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class RestPokeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestPokeApiApplication.class, args);
	}

}
