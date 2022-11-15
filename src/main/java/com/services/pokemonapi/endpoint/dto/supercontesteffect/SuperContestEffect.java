package com.services.pokemonapi.endpoint.dto.supercontesteffect;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.FlavorText;
import com.services.pokemonapi.endpoint.dto.move.Move;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SuperContestEffect implements Serializable {

	private Integer id;
	private Integer appeal;
	private List<FlavorText> flavorTextEntries;
	private List<NamedApiResource<Move>> moves;

}
