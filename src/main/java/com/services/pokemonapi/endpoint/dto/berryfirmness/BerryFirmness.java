package com.services.pokemonapi.endpoint.dto.berryfirmness;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.PokeApiResource;
import com.services.pokemonapi.endpoint.dto.Name;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.berry.Berry;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BerryFirmness implements Serializable, PokeApiResource {

	private Integer id;
	private String name;
	private List<NamedApiResource<Berry>> berries;
	private List<Name> names;

	
}
