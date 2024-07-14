package com.hibernate.practice;
import javax.persistence.*;

@Entity
@Table(name="Tbl")
public class embeded_entity {
private String name;
@Id
private int roll;
private String place;
private embded_object emp;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public embded_object getEmp() {
	return emp;
}
public void setEmp(embded_object emp) {
	this.emp = emp;
}
public embeded_entity(String name, int roll, String place, embded_object emp) {
	super();
	this.name = name;
	this.roll = roll;
	this.place = place;
	this.emp = emp;
}
public embeded_entity() {
	super();
	this.name = name;
	this.roll = roll;
	this.place = place;
	this.emp = emp;
}

@Override
public String toString() {
	return "embeded_entity [name=" + name + ", roll=" + roll + ", place=" + place + ", emp=" + emp + "]";
}

}
