package com.yorku.library.restservice.models;

import java.util.Set;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("student")
public class Student extends User{
	
	private String studentNum;

	public Student(String username, String pw, String email, String studentNum) {
		super(username, pw, email);
		this.studentNum = studentNum;
		// TODO Auto-generated constructor stub
	}

}
