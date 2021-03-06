package com.jsf.demo;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="studentTwo")
public class StudentTwo {
	
	private String firstName;
	private String lastName;
	private String country;
	
	//list of countries for the drop-down list
	List<String> countryOptions;
	
	// no-arg constructor
	public StudentTwo(){
		//populate the list of countries
		countryOptions = new ArrayList<>();
		
		countryOptions.add("Romania");
		countryOptions.add("France");
		countryOptions.add("Brazil");
		countryOptions.add("Italy");
		countryOptions.add("United States");
	}
	
	// create getter for countryOptions
	public List<String> getCountryOptions() {
		return countryOptions;
	}
	
	// generate getter/setter
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
