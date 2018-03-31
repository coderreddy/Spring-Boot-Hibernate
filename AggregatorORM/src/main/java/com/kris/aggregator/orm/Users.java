package com.kris.aggregator.orm;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	
	@Id
	private int id;
	
	private String firstname;
	
	private String lastname;

	public String getFirstname() {
		return firstname;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return String.format("{\"FIRST_NAME : %s\", \"LAST_NAME : %s\"}", firstname,lastname);
	}
	
	

}
