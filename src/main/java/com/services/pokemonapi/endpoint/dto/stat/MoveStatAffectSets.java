package com.services.pokemonapi.endpoint.dto.stat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MoveStatAffectSets implements Serializable {

	private List<MoveStatAffect> increase;
	private List<MoveStatAffect> decrease;

}
