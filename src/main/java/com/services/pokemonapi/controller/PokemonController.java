package com.services.pokemonapi.controller;

import com.services.pokemonapi.business.PokemonService;
import com.services.pokemonapi.endpoint.dto.NamedApiResourceList;
import com.services.pokemonapi.endpoint.dto.pokemon.Pokemon;
import com.services.pokemonapi.exception.PokemonServiceException;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@SecurityRequirement(name = "javainuseapi")
@RequestMapping(produces = "application/json")
public class PokemonController {
    private final Logger logger = LoggerFactory.getLogger(PokemonController.class);
    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping(path = "/list")
    public ResponseEntity<List<String>> getAllPokemon(){
        logger.info("******  Fetch pokemon list **** ");
        List<String> response = pokemonService.getAllPokemons();
        return ResponseEntity.ok().body(response);
    }

    @GetMapping(path = "/name")
    public ResponseEntity<Pokemon> getPokemonByName(String name) {
        logger.info("******  Get pokemon by name **** ");
        Pokemon response = pokemonService.getPokemonByName(name);
        return ResponseEntity.ok().body(response);
    }

}
