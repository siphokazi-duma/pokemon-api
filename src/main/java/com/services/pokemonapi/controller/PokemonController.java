package com.services.pokemonapi.controller;

import com.services.pokemonapi.business.PokemonService;
import com.services.pokemonapi.endpoint.dto.NamedApiResourceList;
import com.services.pokemonapi.endpoint.dto.pokemon.Pokemon;
import com.services.pokemonapi.exception.PokemonServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/pokemon", produces = "application/json")
public class PokemonController {
    private final Logger logger = LoggerFactory.getLogger(PokemonController.class);
    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping(path = "/list")
    public ResponseEntity<NamedApiResourceList<Pokemon>> getAllPokemon(){
        logger.info("******  Fetch pokemon list **** ");
        NamedApiResourceList<Pokemon> response = pokemonService.getAllPokemons();
        return ResponseEntity.ok().body(response);
    }

    @GetMapping(path = "/name")
    public ResponseEntity<Pokemon> getPokemonByName(String name){
        logger.info("******  Get pokemon by name **** ");
        Pokemon response = pokemonService.getPokemonByName(name);
        //Optional<Pokemon> pokemonOptional = Optional.ofNullable(response).orElseThrow(() -> new PokemonServiceException("Pokemon not found", HttpStatus.NOT_FOUND));
        return ResponseEntity.ok().body(response);
    }

    @GetMapping(path = "/detail")
    public ResponseEntity<Object> getPokemonByName(String name,String detail){
        logger.info("******  Get pokemon details **** ");
        Object response = pokemonService.getPokemonDetailsByName(name,detail);
        return ResponseEntity.ok().body(response);
    }

    //TODO
    //Advisor

    //Spring validator
    //@Validate(notNull) parameter


}
