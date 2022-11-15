package com.services.pokemonapi.endpoint.dto.language;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.PokeApiResource;
import com.services.pokemonapi.endpoint.dto.Name;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Language implements Serializable, PokeApiResource {

	private Integer id;
	private String name;
	private Boolean official;
	private String iso639;
	private String iso3166;
	private List<Name> names;

}
