package com.services.pokemonapi.endpoint.dto.pokemon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.services.pokemonapi.endpoint.dto.movelearnmethod.MoveLearnMethod;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.versiongroup.VersionGroup;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonMoveVersion implements Serializable {

	@JsonProperty("move_learn_method")
	private NamedApiResource<MoveLearnMethod> moveLearnMethod;
	@JsonProperty("version_group")
	private NamedApiResource<VersionGroup> versionGroup;
	@JsonProperty("level_learned_at")
	private Integer levelLearnedAt;

}
