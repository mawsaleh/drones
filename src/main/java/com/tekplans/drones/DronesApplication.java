package com.tekplans.drones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan(basePackages = {"com.tekplans.drones.entities"})

@SpringBootApplication
public class DronesApplication {
	// main class
	public static void main(String[] args) {
		SpringApplication.run(DronesApplication.class, args);
	}

}
