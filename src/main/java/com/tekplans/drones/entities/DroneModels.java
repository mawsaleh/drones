package com.tekplans.drones.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DroneModels {
	@Id
	private String droneModel;

	public DroneModels(String droneModel) {
		super();
		this.droneModel = droneModel;
	}

	public String getModel() {
		return droneModel;
	}

	public void setModel(String droneModel) {
		this.droneModel = droneModel;
	}
	
	
}
