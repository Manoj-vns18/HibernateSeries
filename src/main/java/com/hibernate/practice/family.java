package com.hibernate.practice;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.Date;

//import javax.persistence.*;

@Entity
public class family {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int fid;
	
	@Column(name="f_name")
	private String fname;
	
	@Column(name="family_city")
	private String city;
	
	//@Transient
	@Column(name="date_of ")
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@Override
	public String toString() {
		return "family [fid=" + fid + ", fname=" + fname + ", city=" + city + ", dob=" + dob + ", isopen=" + isopen
				+ "]";
	}
	public family(boolean isopen) {
		super();
		this.isopen = isopen;
	}
	public boolean isIsopen() {
		return isopen;
	}
	public void setIsopen(boolean isopen) {
		this.isopen = isopen;
	}

	@Column(name="is_open")
	private boolean isopen;
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public family() {
		super();
		
	}
	
	public family(int fid, String fname, String city, Date dob) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.city = city;
		this.dob = dob;
	}
	

	
	

}
