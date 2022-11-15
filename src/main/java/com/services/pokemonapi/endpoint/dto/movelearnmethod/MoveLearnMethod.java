package com.services.pokemonapi.endpoint.dto.movelearnmethod;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.PokeApiResource;
import com.services.pokemonapi.endpoint.dto.Description;
import com.services.pokemonapi.endpoint.dto.Name;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.versiongroup.VersionGroup;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MoveLearnMethod implements Serializable, PokeApiResource {

	private Integer id;
	private String name;
	private List<Description> descriptions;
	private List<Name> names;
	private List<NamedApiResource<VersionGroup>> versionGroups;

}
