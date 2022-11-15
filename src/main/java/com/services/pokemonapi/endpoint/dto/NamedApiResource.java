package com.services.pokemonapi.endpoint.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class NamedApiResource<T extends PokeApiResource> implements Serializable {

	private String name;
	private String url;
	
}
