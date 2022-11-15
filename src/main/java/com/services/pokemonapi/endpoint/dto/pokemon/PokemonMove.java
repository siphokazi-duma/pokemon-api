package com.services.pokemonapi.endpoint.dto.pokemon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.services.pokemonapi.endpoint.dto.move.Move;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonMove implements Serializable {

	private NamedApiResource<Move> move;
	@JsonProperty("version_group_details")
	private List<PokemonMoveVersion> versionGroupDetails;

}
