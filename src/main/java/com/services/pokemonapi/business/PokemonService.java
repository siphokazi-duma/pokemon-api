package com.services.pokemonapi.business;

import com.services.pokemonapi.endpoint.dto.pokemon.Pokemon;

import java.util.List;


public interface PokemonService {
    List<String> getAllPokemons();

    Pokemon getPokemonByName(String name);
}
