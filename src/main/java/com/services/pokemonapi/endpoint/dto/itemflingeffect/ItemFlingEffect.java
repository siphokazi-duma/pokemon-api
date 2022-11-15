package com.services.pokemonapi.endpoint.dto.itemflingeffect;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.Effect;
import com.services.pokemonapi.endpoint.dto.PokeApiResource;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.item.Item;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemFlingEffect implements Serializable, PokeApiResource {

	private Integer id;
	private String name;
	private List<Effect> effectEntries;
	private List<NamedApiResource<Item>> items;

}
