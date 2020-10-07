package com.baton.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baton.model.*;
import com.baton.repository.FreeSpaceRepository;
import com.baton.repository.LevelRepo;

@Service
public class LevelService {

	@Autowired
	LevelRepo levelRepo;
	@Autowired
	FreeSpaceRepository freeSpacerepository;
	Level level, checkLevel;
	FreeSpace freeSpace;

	public int parkLevel(String vehicleType) {
	
		int levels = level.numberOfLevels();
		for(int count=1;count<=levels;count++) {
			checkLevel=levelRepo.findById(count).get();
			freeSpace=freeSpacerepository.findById(count).get();
			if(vehicleType=="bus") {
				if(count>2)
					System.out.println("Parking full");
				else {
					int a=freeSpace.getNoOfBuses();
					int b=checkLevel.getNoOfBus();
					if(a<b) {
						//increase number of bus
						//return level id
						freeSpace.setNoOfBuses();
						return count;
					}
					}
				}
			else if(vehicleType=="car") {
				if(freeSpace.getNoOfcars()<checkLevel.getNoOfCars()) {
					//increase the number of car and return levelid
					freeSpace.setNoOfcars();
					return count;
				}
			}
			else if(vehicleType=="bike") {
				if(freeSpace.getNoOfBikes()<checkLevel.getNoOfBike()) {
					//increase the number of bike and return levelid
					freeSpace.setNoOfBikes();
					return count;
				}
			}
			else if(vehicleType=="van") {
					if(freeSpace.getNoOfBuses()<checkLevel.getNoOfVan()) {
						//increase the number of car and return levelid
						freeSpace.setNoOfVans();
						return count;
				}
			}
			}
		return levels;
	}

	public void parkVehicle(String typeOfVehicle) {

	}

	public int addLevel() {
		level.addLevel();
		int noOfLevels=level.numberOfLevels();
		checkLevel=levelRepo.findById(noOfLevels).get();
		if(noOfLevels<3) {
		   //assign values
	    }
	}

}
