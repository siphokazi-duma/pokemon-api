package com.services.pokemonapi.endpoint.dto.growthrate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GrowthRateExperienceLevel implements Serializable {

	private Integer level;
	private Integer experience;

}
