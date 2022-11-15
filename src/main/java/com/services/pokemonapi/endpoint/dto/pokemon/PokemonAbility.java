package com.services.pokemonapi.endpoint.dto.pokemon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.ability.Ability;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonAbility implements Serializable {

	@JsonProperty("is_hidden")
	private Boolean isHidden;
	private Integer slot;
	private NamedApiResource<Ability> ability;
	
}
