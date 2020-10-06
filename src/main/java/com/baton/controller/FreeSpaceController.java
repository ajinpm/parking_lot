package com.baton.controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.baton.service.FreeSpaceService;
public class FreeSpaceController {
	
	@Autowired
	FreeSpaceService freespaceService;
	
	public int addCar(int level)
	{
		return freespaceService.addNoOfCar(level);
	}
	public int addBus(int level)
	{
		return freespaceService.addNoOfBus(level);
	}
    public int addVan(int level)
	{
    	return freespaceService.addNoOfVan(level);
	}
    public int addBike(int level)
	{
    	return freespaceService.addNoOfBike(level);
	}
	

}
