package com.yorku.library.restservice.models;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue("faculty")
public class Faculty extends User {
	
	private String faculty;
	
	public Faculty(String username, String pw, String email, String faculty) {
		super(username, pw, email, Role.FACULTY);
		this.faculty = faculty;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
}
