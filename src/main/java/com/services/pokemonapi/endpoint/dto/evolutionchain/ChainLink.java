package com.services.pokemonapi.endpoint.dto.evolutionchain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.pokemonspecies.PokemonSpecies;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChainLink implements Serializable {

	private Boolean isBaby;
	private NamedApiResource<PokemonSpecies> species;
	private List<EvolutionDetail> evolutionDetails;
	private List<ChainLink> evolvesTo;

}
