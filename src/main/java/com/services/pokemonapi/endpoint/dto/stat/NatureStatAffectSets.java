package com.services.pokemonapi.endpoint.dto.stat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.nature.Nature;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class NatureStatAffectSets implements Serializable {

	private List<NamedApiResource<Nature>> increase;
	private List<NamedApiResource<Nature>> decrease;

}
