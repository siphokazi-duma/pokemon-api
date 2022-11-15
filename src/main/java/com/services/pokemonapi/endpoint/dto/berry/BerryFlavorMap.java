package com.services.pokemonapi.endpoint.dto.berry;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.berryflavor.BerryFlavor;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BerryFlavorMap implements Serializable {

	private Integer potency;
	private NamedApiResource<BerryFlavor> flavor;
	
}
