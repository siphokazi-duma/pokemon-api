package com.services.pokemonapi.endpoint.dto.machine;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.item.Item;
import com.services.pokemonapi.endpoint.dto.move.Move;
import com.services.pokemonapi.endpoint.dto.versiongroup.VersionGroup;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Machine implements Serializable {

	private Integer id;
	private NamedApiResource<Item> item;
	private NamedApiResource<Move> move;
	private NamedApiResource<VersionGroup> versionGroup;
	
}
