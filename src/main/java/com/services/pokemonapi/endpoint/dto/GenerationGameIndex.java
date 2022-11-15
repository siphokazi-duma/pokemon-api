package com.services.pokemonapi.endpoint.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.generation.Generation;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GenerationGameIndex implements Serializable {

	private Integer gameIndex;
	private NamedApiResource<Generation> generation;

}
