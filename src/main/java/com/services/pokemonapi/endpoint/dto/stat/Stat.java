package com.services.pokemonapi.endpoint.dto.stat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.ApiResource;
import com.services.pokemonapi.endpoint.dto.PokeApiResource;
import com.services.pokemonapi.endpoint.dto.Name;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.characteristic.Characteristic;
import com.services.pokemonapi.endpoint.dto.movedamageclass.MoveDamageClass;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stat implements Serializable, PokeApiResource {

	private Integer id;
	private String name;
	private Integer gameIndex;
	private Boolean isBattleOnly;
	private MoveStatAffectSets affectingMoves;
	private NatureStatAffectSets affectingNatures;
	private List<ApiResource<Characteristic>> characteristics;
	private NamedApiResource<MoveDamageClass> moveDamageClass;
	private List<Name> names;

}
