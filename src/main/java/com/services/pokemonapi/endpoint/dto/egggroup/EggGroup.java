package com.services.pokemonapi.endpoint.dto.egggroup;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.PokeApiResource;
import com.services.pokemonapi.endpoint.dto.pokemonspecies.PokemonSpecies;
import com.services.pokemonapi.endpoint.dto.Name;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EggGroup implements Serializable, PokeApiResource {

	private Integer id;
	private String name;
	private List<Name> names;
	private List<NamedApiResource<PokemonSpecies>> pokemonSpecies;
}
