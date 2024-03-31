package com.dragonball.characterdata.dto;

import java.util.UUID;

public class DragonBallCharacterDto {
	
	private UUID id;
	
	private String name;
	
	private String species;
	
	private String gender;
	
	private String alias;

	public DragonBallCharacterDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}
	
}
