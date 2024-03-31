package com.dragonball.characterdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dragonball.characterdata.entity.DragonBallCharacter;

@Repository
public interface DragonBallCharacterRepository extends JpaRepository<DragonBallCharacter, Long> {

}
