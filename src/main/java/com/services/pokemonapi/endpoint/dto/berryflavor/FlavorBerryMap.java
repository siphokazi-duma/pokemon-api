package com.services.pokemonapi.endpoint.dto.berryflavor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.berry.Berry;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlavorBerryMap implements Serializable {

	private Integer potency;
	private NamedApiResource<Berry> berry;

	
}
