package com.services.pokemonapi.endpoint.dto.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.PokeApiResource;
import com.services.pokemonapi.endpoint.dto.move.Move;
import com.services.pokemonapi.endpoint.dto.GenerationGameIndex;
import com.services.pokemonapi.endpoint.dto.Name;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.generation.Generation;
import com.services.pokemonapi.endpoint.dto.movedamageclass.MoveDamageClass;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Type implements Serializable, PokeApiResource {

	private Integer id;
	private String name;
	private TypeRelations damageRelations;
	private List<GenerationGameIndex> gameIndices;
	private NamedApiResource<Generation> generation;
	private NamedApiResource<MoveDamageClass> moveDamageClass;
	private List<Name> names;
	private List<TypePokemon> pokemon;
	private List<NamedApiResource<Move>> moves;

}
