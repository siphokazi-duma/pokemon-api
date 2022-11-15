package com.services.pokemonapi.endpoint.dto.pokemonspecies;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.*;
import com.services.pokemonapi.endpoint.dto.pokemonhabitat.PokemonHabitat;
import com.services.pokemonapi.endpoint.dto.egggroup.EggGroup;
import com.services.pokemonapi.endpoint.dto.evolutionchain.EvolutionChain;
import com.services.pokemonapi.endpoint.dto.generation.Generation;
import com.services.pokemonapi.endpoint.dto.growthrate.GrowthRate;
import com.services.pokemonapi.endpoint.dto.pokemoncolor.PokemonColor;
import com.services.pokemonapi.endpoint.dto.pokemonshape.PokemonShape;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonSpecies implements Serializable, PokeApiResource {

	private Integer id;
	private String name;
	private Integer order;
	private Integer genderRate;
	private Integer captureRate;
	private Integer baseHappiness;
	private Boolean isBaby;
	private Boolean isLegendary;
	private Boolean isMythical;
	private Integer hatchCounter;
	private Boolean hasGenderDifferences;
	private Boolean formsSwitchable;
	private NamedApiResource<GrowthRate> growthRate;
	private List<PokemonSpeciesDexEntry> pokedexNumbers;
	private List<NamedApiResource<EggGroup>> eggGroups;
	private NamedApiResource<PokemonColor> color;
	private NamedApiResource<PokemonShape> shape;
	private NamedApiResource<PokemonSpecies> evolvesFromSpecies;
	private ApiResource<EvolutionChain> evolutionChain;
	private NamedApiResource<PokemonHabitat> habitat;
	private NamedApiResource<Generation> generation;
	private List<Name> names;
	private List<FlavorText> flavorTextEntries;
	private List<Description> formDescriptions;
	private List<Genus> genera;
	private List<PokemonSpeciesVariety> varieties;

}
