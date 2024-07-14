package com.hibernate.practice;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
//@Table
public class Alien {
	@Id
	private int noId;
	


	private String name;
	private String planet;
	
	public Alien() {
		super();
		this.noId = noId;
		this.name = name;
		this.planet = planet;
	}
	
	public Alien(int noId, String name, String planet) {
		super();
		this.noId = noId;
		this.name = name;
		this.planet = planet;
	}
	
	
	public int getNoId() {
		return noId;
	}
	public void setNoId(int noId) {
		this.noId = noId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlanet() {
		return planet;
	}
	public void setPlanet(String planet) {
		this.planet = planet;
	}


	@Override
	public String toString() {
		return "Alien [noId=" + noId + ", name=" + name + ", planet=" + planet + "]";
	}
	

}
