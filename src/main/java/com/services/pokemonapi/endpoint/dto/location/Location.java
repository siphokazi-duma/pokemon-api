package com.services.pokemonapi.endpoint.dto.location;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.PokeApiResource;
import com.services.pokemonapi.endpoint.dto.locationarea.LocationArea;
import com.services.pokemonapi.endpoint.dto.region.Region;
import com.services.pokemonapi.endpoint.dto.GenerationGameIndex;
import com.services.pokemonapi.endpoint.dto.Name;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location implements Serializable, PokeApiResource {

	private Integer id;
	private String name;
	private NamedApiResource<Region> region;
	private List<Name> names;
	private List<GenerationGameIndex> gameIndices;
	private List<NamedApiResource<LocationArea>> areas;

}
