package com.services.pokemonapi.endpoint.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.language.Language;
import com.services.pokemonapi.endpoint.dto.version.Version;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlavorText implements Serializable {

	private String flavorText;
	private NamedApiResource<Language> language;
	private NamedApiResource<Version> version;

}
