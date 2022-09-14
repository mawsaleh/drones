package com.tekplans.drones.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import com.tekplans.drones.entities.Drone;
import com.tekplans.drones.repos.DroneRepo;
import org.springframework.http.MediaType;

@RestController

class DroneController {
	@Autowired
	private DroneRepo droneRepo;
	
	@RequestMapping(value="/drones/get", method= {RequestMethod.GET})
	public Iterable<Drone> getDrones() {
		return droneRepo.findAll();
	}
	
	@RequestMapping(value="/drones/regdrone", 
			method= {RequestMethod.POST},
			consumes = {MediaType.APPLICATION_JSON_VALUE},
	        produces = {MediaType.APPLICATION_JSON_VALUE})
	public Boolean registerDrone(@RequestBody Drone drone) {
		return droneRepo;
	}

}
