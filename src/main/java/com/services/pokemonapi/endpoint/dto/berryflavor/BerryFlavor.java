package com.services.pokemonapi.endpoint.dto.berryflavor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.PokeApiResource;
import com.services.pokemonapi.endpoint.dto.Name;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.contesttype.ContestType;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BerryFlavor implements Serializable, PokeApiResource {

	private Integer id;
	private String name;
	private List<FlavorBerryMap> barries;
	private NamedApiResource<ContestType> contestType;
	private List<Name> names;
	
}
