package com.services.pokemonapi.endpoint.dto.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.pokemon.Pokemon;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TypePokemon implements Serializable {

	private Integer slot;
	private NamedApiResource<Pokemon> pokemon;

}
