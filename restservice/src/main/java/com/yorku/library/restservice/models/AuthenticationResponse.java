package com.yorku.library.restservice.models;

public class AuthenticationResponse {
	private String token;
	
	public AuthenticationResponse(String token) {
		this.token = token;
		
	}
	
	public String getToken() {
		return token;
	}
}
