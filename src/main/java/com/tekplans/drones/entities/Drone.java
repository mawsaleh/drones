package com.tekplans.drones.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Drone {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="droneModel")
	private DroneModel droneModel; // Lightweight, Middleweight, Cruiserweight, Heavyweight
	
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="drone_medication", 
		joinColumns = { @JoinColumn(name="droneid") },
		inverseJoinColumns = { @JoinColumn(name="medicationid") })
	private Set<Medication> medications = new HashSet<Medication>();
	
	public Set<Medication> getMedications() {
		return medications;
	}
	public void setMedications(Set<Medication> medications) {
		this.medications = medications;
	}
	
	@Column(length=100)
	private String serialNum; // 100 characters max
	
	private int maxLoad; // 500gr max
	private int batteryCapacity; // percentage;
	public enum DroneState {IDLE, LOADING, LOADED, DELIVERING, DELIVERED, RETURNING};
	private DroneState currentState;
	
	public Drone() {
		super();
	}
	
	public Drone(String serialNum, DroneModel droneModel, int maxLoad, int batteryCapacity, DroneState currentState) {
		super();
		this.serialNum = serialNum;
		this.droneModel = droneModel;
		this.maxLoad = maxLoad;
		this.batteryCapacity = batteryCapacity;
		this.currentState = currentState;
	}
	
	public Drone(String serialNum, String droneModel, int maxLoad, int batteryCapacity, DroneState currentState) {
		super();
		this.serialNum = serialNum;
		this.droneModel = new DroneModel(droneModel);
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
	public DroneModel getModel() {
		return droneModel;
	}
	public void setModel(DroneModel droneModel) {
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
