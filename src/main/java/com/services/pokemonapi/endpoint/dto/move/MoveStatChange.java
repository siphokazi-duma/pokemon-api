package com.services.pokemonapi.endpoint.dto.move;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.stat.Stat;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MoveStatChange implements Serializable {

	private Integer change;
	private NamedApiResource<Stat> stat;

}
