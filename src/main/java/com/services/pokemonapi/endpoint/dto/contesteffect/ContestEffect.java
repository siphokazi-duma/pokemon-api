package com.services.pokemonapi.endpoint.dto.contesteffect;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.Effect;
import com.services.pokemonapi.endpoint.dto.FlavorText;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContestEffect implements Serializable {

	private Integer id;
	private Integer appeal;
	private Integer jam;
	private List<Effect> effectEntries;
	private List<FlavorText> flavorTextEntries;
	
}
