package com.services.pokemonapi.endpoint.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.language.Language;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Description implements Serializable {

	private String description;
	private NamedApiResource<Language> language;

}
