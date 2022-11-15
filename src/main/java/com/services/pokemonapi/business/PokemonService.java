package com.services.pokemonapi.business;

import com.services.pokemonapi.endpoint.dto.NamedApiResourceList;
import com.services.pokemonapi.endpoint.dto.pokemon.Pokemon;


public interface PokemonService {
    NamedApiResourceList<Pokemon> getAllPokemons();

    Pokemon getPokemonByName(String name);

    Object getPokemonDetailsByName(String name, String details);
}
