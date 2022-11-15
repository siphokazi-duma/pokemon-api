package com.services.pokemonapi.endpoint.dto.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemSprites implements Serializable {

	private String imageUrl;

	@JsonProperty("default")
	public String getImageUrl() {
		return imageUrl;
	}

	@JsonProperty("default")
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
}
