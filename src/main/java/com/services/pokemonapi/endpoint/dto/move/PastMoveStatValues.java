package com.services.pokemonapi.endpoint.dto.move;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.VerboseEffect;
import com.services.pokemonapi.endpoint.dto.type.Type;
import com.services.pokemonapi.endpoint.dto.versiongroup.VersionGroup;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PastMoveStatValues implements Serializable {

	private Integer accuracy;
	private Integer effectChance;
	private Integer power;
	private Integer pp;
	private List<VerboseEffect> effectEntries;
	private NamedApiResource<Type> type;
	private NamedApiResource<VersionGroup> versionGroup;

}
