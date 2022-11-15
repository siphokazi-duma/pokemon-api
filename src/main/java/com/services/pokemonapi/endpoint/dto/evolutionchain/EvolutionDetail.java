package com.services.pokemonapi.endpoint.dto.evolutionchain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.move.Move;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.evolutiontrigger.EvolutionTrigger;
import com.services.pokemonapi.endpoint.dto.item.Item;
import com.services.pokemonapi.endpoint.dto.location.Location;
import com.services.pokemonapi.endpoint.dto.pokemonspecies.PokemonSpecies;
import com.services.pokemonapi.endpoint.dto.type.Type;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EvolutionDetail implements Serializable {

	private NamedApiResource<Item> item;
	private NamedApiResource<EvolutionTrigger> trigger;
	private Integer gender;
	private NamedApiResource<Item> heldItem;
	private NamedApiResource<Move> knownMove;
	private NamedApiResource<Type> knownMoveType;
	private NamedApiResource<Location> location;
	private Integer minLevel;
	private Integer minHappiness;
	private Integer minBeauty;
	private Integer minAffection;
	private Boolean needsOverworldRain;
	private NamedApiResource<PokemonSpecies> partySpecies;
	private NamedApiResource<Type> partyType;
	private Integer relativePhysicalStats;
	private String timeOfDay;
	private NamedApiResource<PokemonSpecies> tradeSpecies;
	private Boolean turnUpsideDown;

	
}
