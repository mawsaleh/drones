package com.tekplans.drones.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Drone {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(length=100)
	private String serialNum; // 100 characters max
	private String droneModel; // Lightweight, Middleweight, Cruiserweight, Heavyweight
	private int maxLoad; // 500gr max
	private int batteryCapacity; // percentage;
	public enum DroneState {IDLE, LOADING, LOADED, DELIVERING, DELIVERED, RETURNING};
	private DroneState currentState;
	
	public Drone(String serialNum, String droneModel, int maxLoad, int batteryCapacity, DroneState currentState) {
		super();
		this.serialNum = serialNum;
		this.droneModel = droneModel;
		this.maxLoad = maxLoad;
		this.batteryCapacity = batteryCapacity;
		this.currentState = currentState;
	}
	
	public String getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}
	public String getModel() {
		return droneModel;
	}
	public void setModel(String droneModel) {
		this.droneModel = droneModel;
	}
	public int getMaxLoad() {
		return maxLoad;
	}
	public void setMaxLoad(int maxLoad) {
		this.maxLoad = maxLoad;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	};
	public DroneState getState() {
		return currentState;
	}
	public void setBatteryCapacity(DroneState currentState) {
		this.currentState = currentState;
	};

}
