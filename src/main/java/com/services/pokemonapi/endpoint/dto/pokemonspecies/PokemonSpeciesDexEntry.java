package com.services.pokemonapi.endpoint.dto.pokemonspecies;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.pokedex.Pokedex;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonSpeciesDexEntry implements Serializable {

	private Integer entryNumber;
	private NamedApiResource<Pokedex> pokedex;

}
