package com.jsf.demo;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="studentFour")
public class StudentFour {
	
	private String firstName;
	private String lastName;
	
	// since the user can select multiple languages
	// we need an array of strings
	private String[] favoriteLanguages;
	
	//create no-arg constructor
	public StudentFour() {
		
	}
	
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

	public String[] getFavoriteLanguages() {
		return favoriteLanguages;
	}

	public void setFavoriteLanguages(String[] favoriteLanguages) {
		this.favoriteLanguages = favoriteLanguages;
	}
}
