package com.services.pokemonapi.business.impl;

import com.services.pokemonapi.business.PokemonService;
import com.services.pokemonapi.endpoint.client.PokeapiServiceClient;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.NamedApiResourceList;
import com.services.pokemonapi.endpoint.dto.pokemon.Pokemon;
import com.services.pokemonapi.exception.PokemonServiceException;
import feign.FeignException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PokemonServiceImpl implements PokemonService {
    public static final String APPLICATION_JSON = "application/json";
    public static final String APPLICATION = "Application";
    public static final String NO_CONTENT = "NO CONTENT";
    public static final String NOT_FOUND = "NOT FOUND";

    private final Logger logger = LoggerFactory.getLogger(PokemonServiceImpl.class);
    private final PokeapiServiceClient pokeapiServiceClient;

    public PokemonServiceImpl(PokeapiServiceClient pokeapiServiceClient) {
        this.pokeapiServiceClient = pokeapiServiceClient;
    }
    @Override
    public List<String> getAllPokemons() {
        try{
            NamedApiResourceList<Pokemon> apiResourceList = pokeapiServiceClient.getAllPokemons(APPLICATION_JSON, APPLICATION_JSON,APPLICATION);
            return apiResourceList.getResults().stream().map(NamedApiResource::getName).collect(Collectors.toList());
        }catch(Exception exception){
            throw new PokemonServiceException(NO_CONTENT,HttpStatus.NO_CONTENT);
        }
    }

    @Override
    public Pokemon getPokemonByName(String name) {
       Pokemon pokemon = pokeapiServiceClient.getPokemonByName(APPLICATION_JSON, APPLICATION_JSON, APPLICATION, name.toLowerCase().trim());
       if(pokemon == null){
           throw new PokemonServiceException(NOT_FOUND,HttpStatus.NOT_FOUND);
       }else{
           return pokemon;
       }
    }

}
