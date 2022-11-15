package com.services.pokemonapi.endpoint.dto.move;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.moveailment.MoveAilment;
import com.services.pokemonapi.endpoint.dto.movecategory.MoveCategory;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MoveMetaData implements Serializable {

	private NamedApiResource<MoveAilment> ailment;
	private NamedApiResource<MoveCategory> category;
	private Integer minHits;
	private Integer maxHits;
	private Integer minTurns;
	private Integer maxTurns;
	private Integer drain;
	private Integer healing;
	private Integer critRate;
	private Integer ailmentChance;
	private Integer flinchChance;
	private Integer statChance;

}
