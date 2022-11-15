package com.services.pokemonapi.endpoint.dto.move;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.services.pokemonapi.endpoint.dto.*;
import com.services.pokemonapi.endpoint.dto.ability.AbilityEffectChange;
import com.services.pokemonapi.endpoint.dto.contesteffect.ContestEffect;
import com.services.pokemonapi.endpoint.dto.contesttype.ContestType;
import com.services.pokemonapi.endpoint.dto.generation.Generation;
import com.services.pokemonapi.endpoint.dto.movedamageclass.MoveDamageClass;
import com.services.pokemonapi.endpoint.dto.movetarget.MoveTarget;
import com.services.pokemonapi.endpoint.dto.supercontesteffect.SuperContestEffect;
import com.services.pokemonapi.endpoint.dto.type.Type;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Move implements Serializable, PokeApiResource {

	private Integer id;
	private String name;
	private Integer accuracy;
	private Integer effectChance;
	private Integer pp;
	private Integer priority;
	private Integer power;
	private ContestComboSets contestCombos;
	private NamedApiResource<ContestType> contestType;
	private ApiResource<ContestEffect> contestEffect;
	private NamedApiResource<MoveDamageClass> damageClass;
	private List<VerboseEffect> effectEntries;
	private List<AbilityEffectChange> effectChanges;
	private List<MoveFlavorText> flavorTextEntries;
	private NamedApiResource<Generation> generation;
	private List<MachineVersionDetail> machines;
	private MoveMetaData meta;
	private List<Name> names;
	private List<PastMoveStatValues> pastValues;
	private List<MoveStatChange> statChanges;
	private ApiResource<SuperContestEffect> superContestEffect;
	private NamedApiResource<MoveTarget> target;
	private NamedApiResource<Type> type;

}
