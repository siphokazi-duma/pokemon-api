package com.services.pokemonapi.endpoint.dto.pokemonspecies;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.language.Language;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Genus implements Serializable {

	private String genus;
	private NamedApiResource<Language> language;

}
