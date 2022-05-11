package com.jsf.demo;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="studentFive")
public class StudentFive {

	private String firstName;
	private String lastName;
	private String favoriteLanguage;
	
	// create no-arg constructor
	public StudentFive() {
		//pre-populate the bean
		firstName="Mary";
		lastName="Public";
		favoriteLanguage="Ruby";
	}
	
	// generate getters/setters
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

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	
}
