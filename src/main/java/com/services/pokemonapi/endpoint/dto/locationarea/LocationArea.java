package com.services.pokemonapi.endpoint.dto.locationarea;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.PokeApiResource;
import com.services.pokemonapi.endpoint.dto.Name;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.location.Location;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationArea implements Serializable, PokeApiResource {

	private Integer Id;
	private String name;
	private Integer gameIndex;
	private List<EncounterMethodRate> encoutnerMethodRates;
	private NamedApiResource<Location> location;
	private List<Name> names;
	private List<PokemonEncounter> pokemonEncounters;

	
}
