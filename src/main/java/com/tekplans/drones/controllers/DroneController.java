package com.tekplans.drones.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.tekplans.drones.entities.Drone;
import com.tekplans.drones.repos.DroneRepo;

@RestController

public class DroneController {
	@Autowired
	private DroneRepo droneRepo;
	
	@RequestMapping(value="/drones", method= {RequestMethod.GET})
	public Iterable<Drone> getDrones() {
		return droneRepo.findAll();
	}

}
