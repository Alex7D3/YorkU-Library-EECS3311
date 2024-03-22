package com.yorku.library.restservice.models;

import java.util.Set;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("staff")
public class Staff extends User {
	
	private String staffNum;

	public Staff(String username, String pw, String email, String staffNum) {
		super(username, pw, email);
		this.staffNum = staffNum;
		// TODO Auto-generated constructor stub
	}
	
}
