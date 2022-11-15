package com.services.pokemonapi.endpoint.dto.evolutionchain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.item.Item;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EvolutionChain implements Serializable {

	private Integer id;
	private NamedApiResource<Item> item;
	private ChainLink chain;

}
