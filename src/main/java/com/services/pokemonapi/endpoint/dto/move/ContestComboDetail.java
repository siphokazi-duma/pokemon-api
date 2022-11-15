package com.services.pokemonapi.endpoint.dto.move;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContestComboDetail implements Serializable {

	private List<NamedApiResource<Move>> userBefore;
	private List<NamedApiResource<Move>> userAfter;
	
}
