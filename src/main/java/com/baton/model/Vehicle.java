package com.baton.model;

import javax.persistence.*;

@Entity
@Table(name="Vehicle")
public class Vehicle {
	
	@Id
	@Column(name="Vehicle Id",unique=true)
	private int vehicleId;
	@Column(name="Type")
	private String vehicleType;
	@Column(name="Level")
	private int levelId;
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getLevelId() {
		return levelId;
	}
	public void setLevelId(int levelId) {
		this.levelId = levelId;
	}
		

}
