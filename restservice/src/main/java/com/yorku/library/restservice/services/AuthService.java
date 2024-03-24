package com.yorku.library.restservice.services;

import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.yorku.library.restservice.repositories.UserRepo;
import com.yorku.library.restservice.models.User;
import com.yorku.library.restservice.models.AuthenticationResponse;

@Service	
public class AuthService {
	private final UserRepo repo;
	private final PasswordEncoder passwordEncoder;
	private final JWTService jwtService;
	private final AuthenticationManager authManager;


	public AuthService(UserRepo repo, PasswordEncoder passwordEncoder, JWTService jwtService,  AuthenticationManager authManager) {
		this.repo = repo;
		this.passwordEncoder = passwordEncoder;
		this.jwtService = jwtService;
		this.authManager = authManager;
	}
	
	public AuthenticationResponse register(User request) {
		User user = new User();

		if (repo.findByUsername(request.getUsername()).isPresent()) {
			return new AuthenticationResponse(null);
		}
		
		user.setUsername(request.getUsername());
		user.setEmail(request.getEmail());
		user.setPassword(passwordEncoder.encode(request.getPassword()));
		user.setRole(request.getRole());
		
		user = repo.save(user);
		String token = jwtService.generateToken(user);
		return new AuthenticationResponse(token);
	}
	
	public AuthenticationResponse authenticate(User request) {
		authManager.authenticate(
				new UsernamePasswordAuthenticationToken(
						request.getUsername(),
						request.getPassword()
				)
				);
		
		User user = repo.findByUsername(request.getUsername()).orElseThrow();
		String token = jwtService.generateToken(user);
		
		return new AuthenticationResponse(token);
	}
}