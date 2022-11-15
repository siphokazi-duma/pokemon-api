package com.services.pokemonapi.endpoint.dto.move;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContestComboSets implements Serializable {

	private ContestComboDetail normal;
	private ContestComboDetail superb;
	
}
