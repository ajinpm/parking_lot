package com.baton.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baton.model.*;
import com.baton.repository.*;

@Service
public class VehicleService {
    
	
	@Autowired
	VehicleRepo vehicleRepo;
	@Autowired
	LevelService levelService;

	public void park(Vehicle vehicle) {
		String typeOfVehicle=vehicle.getVehicleType();
		levelService.parkVehicle(typeOfVehicle);
		vehicleRepo.save(vehicle);  
		
	}

	public void vehicleExit(int vehicleId) {
		vehicleRepo.deleteById(vehicleId);  
		
	}
}
