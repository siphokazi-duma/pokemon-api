package com.services.pokemonapi.endpoint.dto.movetarget;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.Description;
import com.services.pokemonapi.endpoint.dto.PokeApiResource;
import com.services.pokemonapi.endpoint.dto.move.Move;
import com.services.pokemonapi.endpoint.dto.Name;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MoveTarget implements Serializable, PokeApiResource {

	private Integer id;
	private String name;
	private List<Description> descriptions;
	private List<NamedApiResource<Move>> moves;
	private List<Name> names;

}
