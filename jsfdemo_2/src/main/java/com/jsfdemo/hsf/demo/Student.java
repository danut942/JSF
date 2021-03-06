package com.jsfdemo.hsf.demo;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	
	// create a no-arg constructor
	public Student() {
		
	}
	
	// create getter/setter method
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
}
