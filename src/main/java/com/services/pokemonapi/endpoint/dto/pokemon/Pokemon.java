package com.services.pokemonapi.endpoint.dto.pokemon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.services.pokemonapi.endpoint.dto.PokeApiResource;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.VersionGameIndex;
import com.services.pokemonapi.endpoint.dto.pokemonform.PokemonForm;
import com.services.pokemonapi.endpoint.dto.pokemonspecies.PokemonSpecies;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon implements Serializable, PokeApiResource {

	private Integer id;
	private String name;
	@JsonProperty("base_experience")
	private Integer baseExperience;
	private Integer height;
	@JsonProperty("is_default")
	private Boolean isDefault;
	private Integer order;
	private Integer weight;
	private List<PokemonAbility> abilities;
	private List<NamedApiResource<PokemonForm>> forms;
	@JsonProperty("game_indices")
	private List<VersionGameIndex> gameIndices;
	@JsonProperty("held_items")
	private List<PokemonHeldItem> heldItems;
	@JsonProperty("location_area_encounters")
	private String locationAreaEncounters;
	private List<PokemonMove> moves;
	private PokemonSprites sprites;
	private NamedApiResource<PokemonSpecies> species;
	private List<PokemonStat> stats;
	private List<PokemonType> types;
	@JsonProperty("past_types")
	private List<PokemonTypePast> pastTypes;

}
