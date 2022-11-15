package com.services.pokemonapi.endpoint.dto.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.*;
import com.services.pokemonapi.endpoint.dto.itemattribute.ItemAttribute;
import com.services.pokemonapi.endpoint.dto.itemflingeffect.ItemFlingEffect;
import com.services.pokemonapi.endpoint.dto.evolutionchain.EvolutionChain;
import com.services.pokemonapi.endpoint.dto.itemcategory.ItemCategory;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item implements Serializable, PokeApiResource {

	private Integer id;
	private String name;
	private Integer cost;
	private Integer flingPower;
	private NamedApiResource<ItemFlingEffect> flingEffect;
	private List<NamedApiResource<ItemAttribute>> attributes;
	private List<NamedApiResource<ItemCategory>> category;
	private List<VerboseEffect> effectEntries;
	private List<VersionGroupFlavorText> flavorTextEntries;
	private List<GenerationGameIndex> gameIndices;
	private List<Name> names;
	private ItemSprites sprites;
	private List<ItemHolderPokemon> heldByPokemon;
	private ApiResource<EvolutionChain> babyTriggerFor;
	private List<MachineVersionDetail> machines;

}
