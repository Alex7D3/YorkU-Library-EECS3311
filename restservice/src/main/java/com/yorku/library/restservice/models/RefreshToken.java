package com.yorku.library.restservice.models;

import java.time.Instant;

import jakarta.persistence.*;

public class RefreshToken {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String token;
	private Instant expiryDate;
	
	@OneToOne
	@JoinColumn(name = "user", referencedColumnName = "id")
	private User userInfo;
}
