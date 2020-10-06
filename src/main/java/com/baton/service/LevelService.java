package com.baton.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baton.model.Level;
import com.baton.repository.LevelRepo;

@Service
public class LevelService {

	@Autowired
	LevelRepo levelRepo;
	Level level, checkLevel;

	public int parkLevel(String vehicleType) {
		int levels = level.numberOfLevels();
		for(int count=1;count<=levels;count++) {
			checkLevel=levelRepo.findById(count).get();
			if(vehicleType=="bus") {
				if(count>2)
					System.out.println("Parking full");
				else
					//increase no of bus
			}
			else if(vehicleType=="car") {
				if(checkLevel.getNoOfCars()) {//limit
					//increase the number of car and return levelid
				}
			else if(vehicleType=="bike") {
				if(checkLevel.getNoOfCars()) {//limit
					//increase the number of bike and return levelid
				}
			else if(vehicleType=="van") {
					if(checkLevel.getNoOfCars()) {//limit
						//increase the number of car and return levelid
				}
			}
		}
		return 0;
	}

	public void parkVehicle(String typeOfVehicle) {

	}

	public int addLevel() {
		level.addLevel();
		return level.numberOfLevels();
	}

}
