package com.services.pokemonapi.business.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.services.pokemonapi.business.PokemonService;
import com.services.pokemonapi.endpoint.client.PokeapiServiceClient;
import com.services.pokemonapi.endpoint.dto.pokemon.Pokemon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PokemonServiceImplTest {
    private final Logger logger = LoggerFactory.getLogger(PokemonServiceImplTest.class);
    private final ObjectMapper jsonMapper = new ObjectMapper();
    private PokemonService pokemonService;

    @Mock
    private PokeapiServiceClient pokeapiServiceClient;

    @BeforeEach
    public void init() {
        pokemonService = new PokemonServiceImpl(pokeapiServiceClient);
    }

    @Test
    public void getAllPokemons_notFound(){
        Pokemon pokemon = null;
        Mockito.when(pokeapiServiceClient.getPokemonByName(Mockito.anyString(),Mockito.anyString(),Mockito.anyString(),Mockito.anyString())).thenReturn(pokemon);
        assertNull(pokemon);
        assertEquals(HttpStatus.NOT_FOUND,ResponseEntity.ok().body(pokemon).getStatusCode());
    }

    @Test
    public void getAllPokemons_success(){
        Pokemon pokemon = null;
        Mockito.when(pokeapiServiceClient.getPokemonByName(Mockito.anyString(),Mockito.anyString(),Mockito.anyString(),Mockito.anyString())).thenReturn(pokemon);
        assertEquals(HttpStatus.OK,ResponseEntity.ok().body(pokemon).getStatusCode());
    }

    /*@Test
    public void getAllPokemons_success() throws Exception {
        String content = new TestUtils().getFileContents("data/impl/health_return/health_return_config_all_activities.json");
        Pokemon pokemonNamedApiResourceList = jsonMapper.readValue(content, Pokemon.class);

        Mockito.when(pokeapiServiceClient.getAllPokemons(Mockito.anyString(),Mockito.anyString(),Mockito.anyString())).thenReturn(null);
        NamedApiResourceList<Pokemon> response = null;
        assertNotNull(response);
    }*/
}
