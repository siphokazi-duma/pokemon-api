package com.services.pokemonapi.endpoint.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class NamedApiResourceList<T extends PokeApiResource> implements Serializable {

	private Integer count;
	private String next;
	private Boolean previous;
	private List<NamedApiResource<T>> results;

}
