package com.yorku.library.restservice.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("staff")
public class Staff extends User {
	
	private String staffNum;

	public Staff(String username, String pw, String email, String staffNum) {
		super(username, pw, email, Role.NON_FACULTY_STAFF);
		this.staffNum = staffNum;
		// TODO Auto-generated constructor stub
	}

	public String getStaffNum() {
		return staffNum;
	}

	public void setStaffNum(String staffNum) {
		this.staffNum = staffNum;
	}
}
