package com.services.pokemonapi.endpoint.dto.gender;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.pokemonspecies.PokemonSpecies;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Gender implements Serializable {

	private Integer id;
	private String name;
	private List<PokemonSpeciesGender> pokemonSpeciesDetails;
	private List<NamedApiResource<PokemonSpecies>> requiredForEvolution;

}
