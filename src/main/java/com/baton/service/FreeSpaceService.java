package com.baton.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.baton.model.*;
import com.baton.repository.FreeSpaceRepository;

public class FreeSpaceService {
	@Autowired
	FreeSpaceRepository freespaceRepository;
	FreeSpace freespace;

	public int addNoOfCar(int level) {
		freespace = freespaceRepository.findById(level).get();
		freespace.setNoOfcars();
		return freespace.getId();

	}

	public int addNoOfBus(int level) {
		freespace = freespaceRepository.findById(level).get();
		freespace.setNoOfBuses();
		return freespace.getId();

	}

	public int addNoOfVan(int level) {
		freespace = freespaceRepository.findById(level).get();
		freespace.setNoOfVan();
		return freespace.getId();

	}

	public int addNoOfBike(int level) {
		freespace = freespaceRepository.findById(level).get();
		freespace.setNoOfBikes();
		return freespace.getId();

	}

}
