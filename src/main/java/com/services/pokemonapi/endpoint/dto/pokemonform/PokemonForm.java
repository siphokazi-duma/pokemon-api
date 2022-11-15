package com.services.pokemonapi.endpoint.dto.pokemonform;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.Name;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.PokeApiResource;
import com.services.pokemonapi.endpoint.dto.pokemon.Pokemon;
import com.services.pokemonapi.endpoint.dto.versiongroup.VersionGroup;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonForm implements Serializable, PokeApiResource {

	private Integer id;
	private String name;
	private Integer order;
	private Integer formOrder;
	private Boolean isDefault;
	private Boolean isBattleOnly;
	private String formName;
	private NamedApiResource<Pokemon> pokemon;
	private PokemonFormSprites sprites;
	private NamedApiResource<VersionGroup> versionGroup;
	private List<Name> names;
	private List<Name> formNames;

}
