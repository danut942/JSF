package com.jsf.learning;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="studentOne")
public class StudentOne {
	
	private String firstName;
	private String lastName;
	private String email;
	
	// create a no-arg constructor
	public StudentOne() {
		
	}
	
	// define getter/setter
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
