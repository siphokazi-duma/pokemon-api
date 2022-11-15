package com.services.pokemonapi.endpoint.client;

import com.services.pokemonapi.endpoint.dto.NamedApiResourceList;
import com.services.pokemonapi.endpoint.dto.pokemon.Pokemon;
import com.services.pokemonapi.endpoint.dto.pokemon.PokemonAbility;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;


@FeignClient(name = "pokeapiServiceClient" , url = "${endpoint.pokeapi.url}")
public interface PokeapiServiceClient {
    String CONTENT_TYPE = "Content-Type";

    @GetMapping(value = "/pokemon?limit=1154")
    NamedApiResourceList<Pokemon> getAllPokemons(@RequestHeader(CONTENT_TYPE) String contentType,
                                                 @RequestHeader("Accept") String accept,
                                                 @RequestHeader("user-agent") String userAgent);

    @GetMapping("/pokemon/{name}")
    Pokemon getPokemonByName(@RequestHeader("Content-Type") String contentType,
                                        @RequestHeader("Accept") String accept,
                                        @RequestHeader("user-agent") String userAgent,
                                        @PathVariable(name = "name") String name);

    @GetMapping("/ability/{id}")
    PokemonAbility getPokemonAbilityById(@RequestHeader("Content-Type") String contentType,
                                         @RequestHeader("Accept") String accept,
                                         @RequestHeader("user-agent") String userAgent,
                                         @PathVariable(name = "id") String id);

    @GetMapping("/characteristic/{name}")
    Pokemon getPokemonCharacteristicByName(@RequestHeader("Content-Type") String contentType,
                                           @RequestHeader("Accept") String accept,
                                           @RequestHeader("user-agent") String userAgent,
                                           @PathVariable(name = "name") String name);

    @GetMapping("/egg-group/{name}")
    Pokemon getPokemonEggGroupById(@RequestHeader("Content-Type") String contentType,
                                         @RequestHeader("Accept") String accept,
                                         @RequestHeader("user-agent") String userAgent,
                                         @PathVariable(name = "id") String id);

    @GetMapping("/gender/{name}")
    Pokemon getPokemonGenderById(@RequestHeader("Content-Type") String contentType,
                                   @RequestHeader("Accept") String accept,
                                   @RequestHeader("user-agent") String userAgent,
                                   @PathVariable(name = "name") String id);

    @GetMapping("/growth-rate/{name}")
    Pokemon getPokemonGrowthRateById(@RequestHeader("Content-Type") String contentType,
                                 @RequestHeader("Accept") String accept,
                                 @RequestHeader("user-agent") String userAgent,
                                 @PathVariable(name = "name") String id);

    @GetMapping("/nature/{name}")
    Pokemon getPokemonNaturesById(@RequestHeader("Content-Type") String contentType,
                                     @RequestHeader("Accept") String accept,
                                     @RequestHeader("user-agent") String userAgent,
                                     @PathVariable(name = "name") String id);

    @GetMapping("/pokeathlon-stat/{name}")
    Pokemon getPokemonPokeAthlonStatsById(@RequestHeader("Content-Type") String contentType,
                                  @RequestHeader("Accept") String accept,
                                  @RequestHeader("user-agent") String userAgent,
                                  @PathVariable(name = "name") String id);

    @GetMapping("/pokemon/{name}/encounters")
    Pokemon getPokemonLocationAreasByName(@RequestHeader("Content-Type") String contentType,
                                          @RequestHeader("Accept") String accept,
                                          @RequestHeader("user-agent") String userAgent,
                                          @PathVariable(name = "name") String name);

    @GetMapping("/pokemon-color/{name}")
    Pokemon getPokemonColorsById(@RequestHeader("Content-Type") String contentType,
                                          @RequestHeader("Accept") String accept,
                                          @RequestHeader("user-agent") String userAgent,
                                          @PathVariable(name = "name") String id);

    @GetMapping("/pokemon-form/{name}")
    Pokemon getPokemonFormsById(@RequestHeader("Content-Type") String contentType,
                                 @RequestHeader("Accept") String accept,
                                 @RequestHeader("user-agent") String userAgent,
                                 @PathVariable(name = "name") String id);

    @GetMapping("/pokemon-habitat/{name}")
    Pokemon getPokemonHabitatsById(@RequestHeader("Content-Type") String contentType,
                                @RequestHeader("Accept") String accept,
                                @RequestHeader("user-agent") String userAgent,
                                @PathVariable(name = "name") String id);

    @GetMapping("/pokemon-shape/{name}")
    Pokemon getPokemonShapesById(@RequestHeader("Content-Type") String contentType,
                                   @RequestHeader("Accept") String accept,
                                   @RequestHeader("user-agent") String userAgent,
                                   @PathVariable(name = "id") String id);

    @GetMapping("/pokemon-species/{id}")
    Pokemon getPokemonSpeciesById(@RequestHeader("Content-Type") String contentType,
                                  @RequestHeader("Accept") String accept,
                                  @RequestHeader("user-agent") String userAgent,
                                  @PathVariable(name = "name") String id);

    @GetMapping("/stat/{name}")
    Pokemon getPokemonStatsById(@RequestHeader("Content-Type") String contentType,
                                @RequestHeader("Accept") String accept,
                                @RequestHeader("user-agent") String userAgent,
                                @PathVariable(name = "name") String id);

    @GetMapping("/type/{name}")
    Pokemon getPokemonTypesById(@RequestHeader("Content-Type") String contentType,
                                @RequestHeader("Accept") String accept,
                                @RequestHeader("user-agent") String userAgent,
                                @PathVariable(name = "name") String id);
}
