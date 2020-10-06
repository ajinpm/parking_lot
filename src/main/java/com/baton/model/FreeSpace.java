package com.baton.model;

import org.springframework.beans.factory.annotation.Autowired;

public class FreeSpace {

	@Autowired
	Level level;
	private int id;
	private int noOfcars=0;
	private int noOfBikes=0;
	private int noOfVans=0;
	private int noOfBuses=0;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNoOfcars() {
		return noOfcars;
	}
	public void setNoOfcars() {
		this.noOfcars = this.noOfcars+1;
	}
	public int getNoOfBikes() {
		return noOfBikes;
	}
	public void setNoOfBikes() {
		this.noOfBikes +=1;
	}
	public int getNoOfVans() {
		return noOfVans;
	}
	public void setNoOfVans() {
		this.noOfVans +=1;
	}
	public int getNoOfBuses() {
		return noOfBuses;
	}
	public void setNoOfBuses() {
		this.noOfBuses+=1;
	}
	
}
