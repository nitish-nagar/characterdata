package com.dragonball.characterdata.serviceimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dragonball.characterdata.constants.Constants;
import com.dragonball.characterdata.dto.DragonBallCharacterDto;
import com.dragonball.characterdata.entity.DragonBallCharacter;
import com.dragonball.characterdata.repository.DragonBallCharacterRepository;
import com.dragonball.characterdata.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{
	
	@Autowired
	DragonBallCharacterRepository dragonBallCharacterRepository;
	
	public List<Map<String,Object>> getData(){
		List<Map<String, Object>> dataFromDb = new ArrayList<>();
		List<DragonBallCharacter> dragonBallCharacters = new ArrayList<>();
		dragonBallCharacters = dragonBallCharacterRepository.findAll();
		dragonBallCharacters.forEach((element) -> {
			Map<String, Object> characterData = new HashMap<>();
			characterData.put("id", element.getId());
			characterData.put("name", element.getName());
			characterData.put("species", element.getSpecies());
			characterData.put("gender", element.getGender());
			characterData.put("alias", element.getAlias());
			dataFromDb.add(characterData);
		});
		return dataFromDb;
	}
	
	public Map<String,Object> putData(DragonBallCharacterDto requestDto){
		Map<String, Object> response = new HashMap<>();
		DragonBallCharacter dragonBallCharacter = new DragonBallCharacter();
		dragonBallCharacter.setName(requestDto.getName().toString());
		dragonBallCharacter.setSpecies(requestDto.getSpecies().toString());
		dragonBallCharacter.setGender(requestDto.getGender().toString());
		dragonBallCharacter.setAlias(requestDto.getAlias().toString());
		dragonBallCharacterRepository.save(dragonBallCharacter);
		response.put("success", true);
		return response;
	}

}
