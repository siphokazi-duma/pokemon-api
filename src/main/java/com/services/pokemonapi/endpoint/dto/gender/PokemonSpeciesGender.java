package com.services.pokemonapi.endpoint.dto.gender;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.pokemonspecies.PokemonSpecies;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonSpeciesGender implements Serializable {

	private Integer rate;
	private NamedApiResource<PokemonSpecies> pokemonSpecies;

}
