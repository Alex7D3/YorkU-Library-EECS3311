package com.yorku.library.restservice.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("staff")
public class Staff extends User {
	
	public Staff(String username, String pw, String email) {
		super(username, pw, email, Role.NON_FACULTY_STAFF);
		// TODO Auto-generated constructor stub
	}
}
