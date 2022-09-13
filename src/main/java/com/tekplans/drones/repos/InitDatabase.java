package com.tekplans.drones.repos;

import java.util.List;
import java.util.ArrayList;
import com.tekplans.drones.entities.*;
import com.tekplans.drones.entities.Drone.DroneState;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class InitDatabase implements CommandLineRunner{
	
	private static final Logger log = LoggerFactory.getLogger(InitDatabase.class);
	@Autowired
	private DroneRepo droneRepo;
	
	@Autowired
	private DroneModelRepo dmRepo;

	public void run (String... args) throws Exception{
		String modelNames[]= {"Lightweight", "Middleweight", "Cruiserweight", "Heavyweight"};
		List<DroneModel> droneModels = new ArrayList<DroneModel>();
		for (int i = 0; i < modelNames.length; i++) {
		    droneModels.add(new DroneModel(modelNames[i]));
		}
		//dmRepo.save(new DroneModel("test"));
		log.info("Loading Models " + dmRepo.saveAll(droneModels));
		log.info("Loading Drone " + droneRepo.save(new Drone("abc", "Middleweight", 500, 100, DroneState.IDLE)));
	}
}


