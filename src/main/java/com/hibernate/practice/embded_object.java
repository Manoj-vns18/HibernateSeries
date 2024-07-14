package com.hibernate.practice;
import javax.persistence.*;
@Embeddable
public class embded_object {
	private int emdInt;
	private String Location;
	
	
	
	@Override
	public String toString() {
		return "embded_object [emdInt=" + emdInt + ", Location=" + Location + "]";
	}
	
	
	public embded_object() {
		super();
		this.emdInt = emdInt;
		this.Location = Location;
	}
	
	
	public embded_object(int emdInt, String location) {
		super();
		this.emdInt = emdInt;
		this.Location = location;
	}
	public int getEmdInt() {
		return emdInt;
	}
	public void setEmdInt(int emdInt) {
		this.emdInt = emdInt;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}

}
