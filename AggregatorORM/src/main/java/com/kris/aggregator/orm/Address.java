package com.kris.aggregator.orm;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	private int id;
	
	private String city;
	
	private String adescription;
	
	private String zip;
	
	private String state;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAdescription() {
		return adescription;
	}

	public void setAdescription(String adescription) {
		this.adescription = adescription;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return String.format("{\"CITY : %s\", \"ADDRESS_DESC : %s\", \"ZIP : %s\", \"STATE : %s\"}", city,adescription,zip,state);
	}
	
	
}
