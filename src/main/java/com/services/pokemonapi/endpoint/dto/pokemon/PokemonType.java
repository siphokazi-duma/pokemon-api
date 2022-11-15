package com.services.pokemonapi.endpoint.dto.pokemon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.type.Type;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonType implements Serializable {

	private Integer slot;
	private NamedApiResource<Type> type;

}
