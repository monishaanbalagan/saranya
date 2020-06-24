package com.example.cab.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cab {
	@Id
	private Integer cabId;
	private String carNumber;
	private String carType;
	private boolean isFree;
	private int seats;
	
	public Integer getCabId() {
		return cabId;
	}
	public void setCabId(Integer cabId) {
		this.cabId = cabId;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public boolean isFree() {
		return isFree;
	}
	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	

}
