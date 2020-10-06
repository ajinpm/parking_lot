package com.baton.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.baton.model.*;
import com.baton.service.LevelService;
import com.baton.service.VehicleService;

@RestController
public class VehicleController {

	@Autowired
	VehicleService vehicleService;
	@Autowired
	LevelService levelService;

	@PutMapping("/park")
	private Vehicle vehiclePark(@RequestBody Vehicle vehicle) {
		//check for available spaces
		 vehicleService.park(vehicle);
		 return vehicle;
	}

	@DeleteMapping("/exit/{vehicleId}")
	private String vehicleExit(@PathVariable("vehicleId") int vehicleId) {
		vehicleService.vehicleExit(vehicleId);
		return null;
	}

}
