package com.services.pokemonapi.endpoint.dto.pokemonspecies;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.pokemon.Pokemon;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonSpeciesVariety implements Serializable {

	private Boolean isDefault;
	private NamedApiResource<Pokemon> pokemon;

}
