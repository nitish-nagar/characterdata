package com.dragonball.characterdata.web.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dragonball.characterdata.dto.DragonBallCharacterDto;
import com.dragonball.characterdata.service.HomeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HomeController {
	
	@Autowired
	HomeService homeService;
	
	@GetMapping(path = "api/getData", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Object> getData(){
		try {
			return new ResponseEntity<>(homeService.getData(), HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping(path = "api/putData", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Object> putData(@RequestBody DragonBallCharacterDto requestDto){
		try {
			return new ResponseEntity<>(homeService.putData(requestDto), HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
