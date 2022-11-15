package com.services.pokemonapi.endpoint.dto.contesttype;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.PokeApiResource;
import com.services.pokemonapi.endpoint.dto.berryflavor.BerryFlavor;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContestType implements Serializable, PokeApiResource {

	private Integer id;
	private String name;
	private NamedApiResource<BerryFlavor> berryFlavor;
	private List<ContestName> names;
	
}
