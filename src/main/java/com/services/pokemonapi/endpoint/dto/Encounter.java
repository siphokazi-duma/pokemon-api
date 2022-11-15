package com.services.pokemonapi.endpoint.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.encounterconditionvalue.EncounterConditionValue;
import com.services.pokemonapi.endpoint.dto.encountermethod.EncounterMethod;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Encounter implements Serializable {

	private Integer minLevel;
	private Integer maxLevel;
	private List<NamedApiResource<EncounterConditionValue>> conditionValues;
	private Integer chance;
	private NamedApiResource<EncounterMethod> method;

}
