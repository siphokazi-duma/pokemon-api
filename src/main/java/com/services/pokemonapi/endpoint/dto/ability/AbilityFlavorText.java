package com.services.pokemonapi.endpoint.dto.ability;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.language.Language;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.versiongroup.VersionGroup;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AbilityFlavorText implements Serializable {

	private String flavorText;
	private NamedApiResource<Language> language;
	private NamedApiResource<VersionGroup> versionGroup;

}
