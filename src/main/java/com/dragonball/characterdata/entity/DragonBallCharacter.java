package com.dragonball.characterdata.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dragonballcharacter")
public class DragonBallCharacter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "species")
	private String species;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "alias")
	private String alias;

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

	public DragonBallCharacter(UUID id, String name, String species, String gender, String alias) {
		super();
		this.id = id;
		this.name = name;
		this.species = species;
		this.gender = gender;
		this.alias = alias;
	}

	public DragonBallCharacter() {
		super();
		// TODO Auto-generated constructor stub
	}
}
