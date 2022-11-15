package com.services.pokemonapi.endpoint.dto.pokemonform;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonFormSprites implements Serializable {

	private String frontDefault;
	private String frontShiny;
	private String backDefault;
	private String backShiny;

}
