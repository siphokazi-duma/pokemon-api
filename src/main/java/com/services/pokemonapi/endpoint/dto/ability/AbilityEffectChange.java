package com.services.pokemonapi.endpoint.dto.ability;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.Effect;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.versiongroup.VersionGroup;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AbilityEffectChange implements Serializable {

	private List<Effect> effectEntries;
	private NamedApiResource<VersionGroup> versionGroup;
}
