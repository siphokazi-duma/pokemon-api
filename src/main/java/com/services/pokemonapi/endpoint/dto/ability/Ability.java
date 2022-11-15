package com.services.pokemonapi.endpoint.dto.ability;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.PokeApiResource;
import com.services.pokemonapi.endpoint.dto.VerboseEffect;
import com.services.pokemonapi.endpoint.dto.Name;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.generation.Generation;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ability implements Serializable, PokeApiResource {

	private Integer id;
	private String name;
	private Boolean isMainSeries;
	private NamedApiResource<Generation> generation;
	private List<Name> names;
	private List<VerboseEffect> effectEntries;
	private List<AbilityEffectChange> effectChanges;
	private List<AbilityFlavorText> flavorTextEntries;
	private List<AbilityPokemon> pokemon;
}
