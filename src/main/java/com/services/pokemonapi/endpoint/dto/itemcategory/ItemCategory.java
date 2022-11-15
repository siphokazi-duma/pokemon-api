package com.services.pokemonapi.endpoint.dto.itemcategory;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.PokeApiResource;
import com.services.pokemonapi.endpoint.dto.item.Item;
import com.services.pokemonapi.endpoint.dto.itempocket.ItemPocket;
import com.services.pokemonapi.endpoint.dto.Name;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemCategory implements Serializable, PokeApiResource {

	private Integer id;
	private String name;
	private List<NamedApiResource<Item>> items;
	private List<Name> names;
	private NamedApiResource<ItemPocket> pocket;

}
