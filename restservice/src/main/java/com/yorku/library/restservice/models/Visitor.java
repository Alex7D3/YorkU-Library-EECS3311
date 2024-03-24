package com.yorku.library.restservice.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue("visitor")
public class Visitor extends User{

	public Visitor() {
		
	}
	
	public Visitor(String username, String pw, String email) {
		super(username, pw, email, Role.VISITOR);
		// TODO Auto-generated constructor stub
	}

}
