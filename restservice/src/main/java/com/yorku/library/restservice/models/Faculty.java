package com.yorku.library.restservice.models;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue("faculty")
public class Faculty extends User {
	
	private String staffNum;
	
	public Faculty() {
		
	}
	
	public Faculty(String username, String pw, String email, String staffNum) {
		super(username, pw, email, Role.FACULTY);
		this.staffNum = staffNum;
	}

	public String getStaffNum() {
		return staffNum;
	}

	public void setStaffNum(String staffNum) {
		this.staffNum = staffNum;
	}
}
