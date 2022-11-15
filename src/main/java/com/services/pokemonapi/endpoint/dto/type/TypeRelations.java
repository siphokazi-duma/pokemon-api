package com.services.pokemonapi.endpoint.dto.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TypeRelations implements Serializable {

	private List<NamedApiResource<Type>> noDamageTo;
	private List<NamedApiResource<Type>> halfDamageTo;
	private List<NamedApiResource<Type>> doubleDamageTo;
	private List<NamedApiResource<Type>> noDamagefrom;
	private List<NamedApiResource<Type>> halfDamagefrom;
	private List<NamedApiResource<Type>> doubleDamagefrom;

}
