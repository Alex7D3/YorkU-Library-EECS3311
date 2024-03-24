package com.yorku.library.restservice.models;


public class AuthenticationResponse {
	private String token;
	private String refreshToken;
	
	public AuthenticationResponse(String token, String refreshToken) {
		this.token = token;
		this.refreshToken = refreshToken;
	}
	
	public String getToken() {
		return token;
	}
}
