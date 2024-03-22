package com.yorku.library.restservice.models;

import java.util.Set;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue("faculty")
public class Faculty extends User {

	public Faculty(String username, String pw, String email) {
		super(username, pw, email);
		// TODO Auto-generated constructor stub
	}
	
}
