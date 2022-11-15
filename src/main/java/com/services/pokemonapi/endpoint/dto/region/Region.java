package com.services.pokemonapi.endpoint.dto.region;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.PokeApiResource;
import com.services.pokemonapi.endpoint.dto.Name;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.generation.Generation;
import com.services.pokemonapi.endpoint.dto.location.Location;
import com.services.pokemonapi.endpoint.dto.pokedex.Pokedex;
import com.services.pokemonapi.endpoint.dto.versiongroup.VersionGroup;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Region implements Serializable, PokeApiResource {

	private Integer id;
	private List<NamedApiResource<Location>> locations;
	private String name;
	private List<Name> names;
	private NamedApiResource<Generation> mainGeneration;
	private List<NamedApiResource<Pokedex>> pokedexes;
	private List<NamedApiResource<VersionGroup>> versionGroups;

}
