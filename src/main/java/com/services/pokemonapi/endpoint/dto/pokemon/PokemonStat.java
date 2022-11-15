package com.services.pokemonapi.endpoint.dto.pokemon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.stat.Stat;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonStat implements Serializable {

	private NamedApiResource<Stat> stat;
	private Integer effort;
	@JsonProperty("base_stat")
	private Integer baseStat;

}
