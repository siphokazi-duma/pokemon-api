package com.services.pokemonapi.endpoint.dto.locationarea;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.version.Version;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EncounterVersionDetails implements Serializable {

	private Integer rate;
	private NamedApiResource<Version> version;

}
