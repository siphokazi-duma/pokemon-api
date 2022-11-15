package com.services.pokemonapi.endpoint.dto.pokemonshape;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.language.Language;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AwesomeName implements Serializable {

	private String awesomeName;
	private NamedApiResource<Language> language;

}
