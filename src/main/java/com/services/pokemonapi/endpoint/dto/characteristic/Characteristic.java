package com.services.pokemonapi.endpoint.dto.characteristic;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Characteristic implements Serializable {

	private Integer id;
	private Integer geneModulo;
	private List<Integer> possibleValues;

	
}
