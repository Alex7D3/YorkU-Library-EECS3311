package com.yorku.library.restservice.services;

import java.util.Map;
import java.util.function.Function;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.yorku.library.restservice.models.User;

@Service
public class JWT {
	
	@Value("${access-secret}")
	private static String ACCESS_SECRET;
	
	@Value("${refresh-secret}")
	private static String REFRESH_SECRET;
	
	public <T> T getClaim(String token, Function<Claims, T> callback) {
		Claim claims = extractAllClaims(token);
		return callback.apply(claims);
	}
	
	public String generateToken(Map<String, ?> claims, User user) {
		return Jwts.builder()
				.claims(claims)
				.subject(user.toString())
				.issuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date)
	}
	
	public Claims getAllClaims(String token) {
		return Jwts.builder()
				.subject(token)
				;
	}
}
