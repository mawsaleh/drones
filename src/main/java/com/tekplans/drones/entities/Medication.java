package com.tekplans.drones.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medication {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name; //allowed only letters, numbers, ‘-‘, ‘_’
	private int weight; // in grams
	private String code; //allowed only upper case letters, underscore and numbers
	private byte[] image; //picture of the medication case
	
		
	public Medication(String name, int weight, String code, byte[] image) {
		super();
		this.name = name;
		this.weight = weight;
		this.code = code;
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	

}
