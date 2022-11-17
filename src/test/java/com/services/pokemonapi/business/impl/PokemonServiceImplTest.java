package com.services.pokemonapi.business.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.services.pokemonapi.TestUtils;
import com.services.pokemonapi.business.PokemonService;
import com.services.pokemonapi.endpoint.client.PokeapiServiceClient;
import com.services.pokemonapi.endpoint.dto.NamedApiResource;
import com.services.pokemonapi.endpoint.dto.NamedApiResourceList;
import com.services.pokemonapi.endpoint.dto.pokemon.Pokemon;
import com.services.pokemonapi.exception.PokemonServiceException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PokemonServiceImplTest {
    public static final String BULBASAUR = "bulbasaur";
    public static final String SIPHO = "Sipho";
    public static final String POKEMON_URL = "https://pokeapi.co/api/v2/pokemon/1/";
    private final ObjectMapper jsonMapper = new ObjectMapper();
    private PokemonService pokemonService;

    @Mock
    private PokeapiServiceClient pokeapiServiceClient;

    @BeforeEach
    public void init() {
        pokemonService = new PokemonServiceImpl(pokeapiServiceClient);
    }

    @Test
    public void getPokemonByName_notFound(){
        Mockito.when(pokeapiServiceClient.getPokemonByName(Mockito.anyString(),Mockito.anyString(),Mockito.anyString(),Mockito.anyString())).thenReturn(null);

        PokemonServiceException exception = Assertions.assertThrows(PokemonServiceException.class, () -> {
            pokemonService.getPokemonByName(SIPHO);
        });

        assertEquals(HttpStatus.NOT_FOUND,exception.getHttpStatus());
    }

    @Test
    public void getAllPokemons_notFound() throws IOException {
        Mockito.when(pokeapiServiceClient.getAllPokemons(Mockito.anyString(),Mockito.anyString(),Mockito.anyString())).thenReturn(new NamedApiResourceList<>());

        PokemonServiceException exception = Assertions.assertThrows(PokemonServiceException.class, () -> {
            pokemonService.getAllPokemons();
        });

        assertEquals(HttpStatus.NO_CONTENT,exception.getHttpStatus());
    }

    @Test
    public void getPokemonByName_success() throws IOException {
        String pokemonString = new TestUtils().getFileContents("data/pokemon.json");
        Pokemon pokemon = jsonMapper.readValue(pokemonString, Pokemon.class);

        Mockito.when(pokeapiServiceClient.getPokemonByName(Mockito.anyString(),Mockito.anyString(),Mockito.anyString(),Mockito.anyString())).thenReturn(pokemon);
        Pokemon pokemonResponse = pokemonService.getPokemonByName(BULBASAUR);

        assertEquals(HttpStatus.OK,ResponseEntity.ok().body(pokemonResponse).getStatusCode());
    }

    @Test
    public void getAllPokemons_success() throws IOException {
        NamedApiResource<Pokemon> pokemonNamedApiResource = new NamedApiResource<>();
        pokemonNamedApiResource.setName(BULBASAUR);
        pokemonNamedApiResource.setUrl(POKEMON_URL);

        List<NamedApiResource<Pokemon>> apiResourceList = new ArrayList<>();
        apiResourceList.add(pokemonNamedApiResource);

        NamedApiResourceList<Pokemon> pokemon = new NamedApiResourceList<>();
        pokemon.setCount(1);
        pokemon.setNext(null);
        pokemon.setPrevious(null);
        pokemon.setResults(apiResourceList);

        Mockito.when(pokeapiServiceClient.getAllPokemons(Mockito.anyString(), Mockito.anyString(), Mockito.anyString())).thenReturn(pokemon);
        List<String> pokemonResponse = pokemonService.getAllPokemons();

        assertEquals(HttpStatus.OK, ResponseEntity.ok().body(pokemonResponse).getStatusCode());
    }

}
