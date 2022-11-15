package com.services.pokemonapi.endpoint.dto.berry;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.PokeApiResource;
import com.services.pokemonapi.endpoint.dto.berryfirmness.BerryFirmness;
import com.services.pokemonapi.endpoint.dto.item.Item;
import com.services.pokemonapi.endpoint.dto.type.Type;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Berry implements Serializable, PokeApiResource {

	private Integer id;
	private String name;
	private Integer growthTime;
	private Integer maxHarvest;
	private Integer naturalGiftPower;
	private Integer size;
	private Integer smoothness;
	private Integer soilDryness;
	private NamedApiResource<BerryFirmness> firmness;
	private List<BerryFlavorMap> flavors;
	private NamedApiResource<Item> item;
	private NamedApiResource<Type> naturalGiftType;
	
}
