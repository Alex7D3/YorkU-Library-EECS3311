package com.yorku.library.restservice.models;

import java.util.Set;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue("visitor")
public class Visitor extends User{

	public Visitor(String username, String pw, String email) {
		super(username, pw, email);
		// TODO Auto-generated constructor stub
	}

}
