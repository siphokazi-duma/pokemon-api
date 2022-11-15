package com.services.pokemonapi.business.impl;

import com.services.pokemonapi.business.PokemonService;
import com.services.pokemonapi.endpoint.client.PokeapiServiceClient;
import com.services.pokemonapi.endpoint.dto.NamedApiResourceList;
import com.services.pokemonapi.endpoint.dto.pokemon.Pokemon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PokemonServiceImpl implements PokemonService {
    public static final String APPLICATION_JSON = "application/json";
    public static final String APPLICATION = "Application";
    public static final String ABILITY = "ability";
    public static final String CHARACTERISTICS = "characteristics";
    public static final String EGG_GROUP = "egg-group";
    public static final String GENDER = "gender";
    public static final String GROWTH_RATE = "growth-rate";
    public static final String NATURE = "nature";
    public static final String POKEATHLON_STATS = "pokeathlon-stats";
    public static final String LOCATION_AREAS = "location-areas";
    public static final String COLORS = "colors";
    public static final String FORM = "form";
    public static final String HABITATS = "habitats";
    public static final String SHAPES = "shapes";
    public static final String SPECIES = "species";
    public static final String STATS = "stats";
    public static final String TYPES = "types";
    private final Logger logger = LoggerFactory.getLogger(PokemonServiceImpl.class);
    private final PokeapiServiceClient pokeapiServiceClient;

    public PokemonServiceImpl(PokeapiServiceClient pokeapiServiceClient) {
        this.pokeapiServiceClient = pokeapiServiceClient;
    }
    //Check for null
    //No results found
    //Create
    @Override
    public NamedApiResourceList<Pokemon> getAllPokemons() {
        try{
            return pokeapiServiceClient.getAllPokemons(APPLICATION_JSON, APPLICATION_JSON,APPLICATION);
        }catch(Exception exception){
            logger.error("Failure: "+exception.getMessage());
        }
        return null;
    }

    @Override
    public Pokemon getPokemonByName(String name) {
        try{
            return pokeapiServiceClient.getPokemonByName(APPLICATION_JSON, APPLICATION_JSON,APPLICATION,name.toLowerCase());
        }catch (Exception exception){
            logger.error("Failure: "+exception.getMessage());
        }
        return null;
    }

    @Override
    public Object getPokemonDetailsByName(String name, String details) {
        try{
            Pokemon pokemon = pokeapiServiceClient.getPokemonByName(APPLICATION_JSON, APPLICATION_JSON,APPLICATION,name.toLowerCase());

            switch (details.toLowerCase()){
                case ABILITY:
                    //return pokeapiServiceClient.getPokemonAbilityById(pokemon.get);
                case CHARACTERISTICS:
                    return pokeapiServiceClient.getPokemonCharacteristicByName(APPLICATION_JSON, APPLICATION_JSON,APPLICATION,pokemon.getName());
                case EGG_GROUP:
                    return pokeapiServiceClient.getPokemonEggGroupById(APPLICATION_JSON, APPLICATION_JSON,APPLICATION,pokemon.getName());
                case GENDER:
                    return pokeapiServiceClient.getPokemonGenderById(APPLICATION_JSON, APPLICATION_JSON,APPLICATION,pokemon.getName());
                case GROWTH_RATE:
                    return pokeapiServiceClient.getPokemonGrowthRateById(APPLICATION_JSON, APPLICATION_JSON,APPLICATION,pokemon.getName());
                case NATURE:
                    return pokeapiServiceClient.getPokemonNaturesById(APPLICATION_JSON, APPLICATION_JSON,APPLICATION,pokemon.getName());
                case POKEATHLON_STATS:
                    return pokeapiServiceClient.getPokemonPokeAthlonStatsById(APPLICATION_JSON, APPLICATION_JSON,APPLICATION,pokemon.getName());
                case LOCATION_AREAS:
                    return pokeapiServiceClient.getPokemonLocationAreasByName(APPLICATION_JSON, APPLICATION_JSON,APPLICATION,pokemon.getName());
                case COLORS:
                    return pokeapiServiceClient.getPokemonColorsById(APPLICATION_JSON, APPLICATION_JSON,APPLICATION,pokemon.getName());
                case FORM:
                    return pokeapiServiceClient.getPokemonFormsById(APPLICATION_JSON, APPLICATION_JSON,APPLICATION,pokemon.getName());
                case HABITATS:
                    return pokeapiServiceClient.getPokemonHabitatsById(APPLICATION_JSON, APPLICATION_JSON,APPLICATION,pokemon.getName());
                case SHAPES:
                    return pokeapiServiceClient.getPokemonShapesById(APPLICATION_JSON, APPLICATION_JSON,APPLICATION,pokemon.getName());
                case SPECIES:
                    return pokeapiServiceClient.getPokemonSpeciesById(APPLICATION_JSON, APPLICATION_JSON,APPLICATION,pokemon.getName());
                case STATS:
                    return pokeapiServiceClient.getPokemonStatsById(APPLICATION_JSON, APPLICATION_JSON,APPLICATION,pokemon.getName());
                case TYPES:
                    return pokeapiServiceClient.getPokemonTypesById(APPLICATION_JSON, APPLICATION_JSON,APPLICATION,pokemon.getName());
            }
        }catch(Exception exception){
            logger.error("Failure: "+exception.getMessage());
        }
        return null;
    }
}
