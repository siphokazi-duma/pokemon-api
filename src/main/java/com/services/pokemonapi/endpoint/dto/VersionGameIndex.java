package com.services.pokemonapi.endpoint.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.services.pokemonapi.endpoint.dto.version.Version;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class VersionGameIndex implements Serializable {

	@JsonProperty("game_index")
	private Integer gameIndex;
	private NamedApiResource<Version> version;

}
