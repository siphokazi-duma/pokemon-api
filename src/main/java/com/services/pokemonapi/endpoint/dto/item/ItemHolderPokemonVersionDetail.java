package com.services.pokemonapi.endpoint.dto.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.version.Version;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemHolderPokemonVersionDetail implements Serializable {

	private Integer rarity;
	private NamedApiResource<Version> version;

}
