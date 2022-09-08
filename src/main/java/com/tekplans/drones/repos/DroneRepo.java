package com.tekplans.drones.repos;

import com.tekplans.drones.entities.*;
import org.springframework.data.repository.CrudRepository;

public interface DroneRepo extends CrudRepository<Drone, Long> {
	
}


