package com.services.pokemonapi.endpoint.dto.encountermethod;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.Name;
import com.services.pokemonapi.endpoint.dto.PokeApiResource;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EncounterMethod implements Serializable, PokeApiResource {

	private Integer id;
	private String name;
	private Integer order;
	private List<Name> names;

}
