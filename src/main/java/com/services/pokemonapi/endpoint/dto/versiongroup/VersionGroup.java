package com.services.pokemonapi.endpoint.dto.versiongroup;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.PokeApiResource;
import com.services.pokemonapi.endpoint.dto.movelearnmethod.MoveLearnMethod;
import com.services.pokemonapi.endpoint.dto.region.Region;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.generation.Generation;
import com.services.pokemonapi.endpoint.dto.pokedex.Pokedex;
import com.services.pokemonapi.endpoint.dto.version.Version;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class VersionGroup implements Serializable, PokeApiResource {

	private Integer id;
	private String name;
	private Integer order;
	private NamedApiResource<Generation> generation;
	private List<NamedApiResource<MoveLearnMethod>> moveLearnMethods;
	private List<NamedApiResource<Pokedex>> pokedexes;
	private List<NamedApiResource<Region>> regions;
	private List<NamedApiResource<Version>> versions;

}
