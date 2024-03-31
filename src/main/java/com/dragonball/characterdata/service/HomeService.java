package com.dragonball.characterdata.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.dragonball.characterdata.dto.DragonBallCharacterDto;

@Service
public interface HomeService {
	
	public List<Map<String,Object>> getData();
	
	public Map<String, Object> putData(DragonBallCharacterDto requestDto);

}
