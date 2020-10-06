package com.baton.model;

import javax.persistence.*;

@Entity
@Table(name="Level")
public class Level {

	@Id
	@Column(name = "Level", unique = true)
	private int LevelId;

	@Column(name = "Car")
	private int noOfCars;

	@Column(name = "Van")
	private int noOfVan;

	@Column(name = "motorcycle")
	private int noOfBike;

	private int noOfLevels = 0;

	public int getLevelId() {
		return LevelId;
	}

	public void setLevelId(int levelId) {
		this.LevelId = levelId;
	}

	public int getNoOfCars() {
		return noOfCars;
	}

	public void setNoOfCars(int noOfCars) {
		this.noOfCars = noOfCars;
	}

	public int getNoOfVan() {
		return noOfVan;
	}

	public void setNoOfVan(int noOfVan) {
		this.noOfVan = noOfVan;
	}

	public int getNoOfBike() {
		return noOfBike;
	}

	public void setNoOfBike(int noOfBike) {
		this.noOfBike = noOfBike;
	}

	public void addLevel() {
		this.noOfLevels = noOfLevels + 1;
	}

	public int numberOfLevels() {
		return noOfLevels;
	}

}
