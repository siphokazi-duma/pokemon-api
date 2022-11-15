package com.services.pokemonapi.endpoint.dto.contesttype;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.language.Language;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContestName implements Serializable {

	private String name;
	private String color;
	private NamedApiResource<Language> language;
	
}
