package com.services.pokemonapi.endpoint.dto.stat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.move.Move;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MoveStatAffect implements Serializable {

	private Integer change;
	private NamedApiResource<Move> move;

}
