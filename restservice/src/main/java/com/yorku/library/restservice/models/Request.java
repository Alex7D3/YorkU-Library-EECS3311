package com.yorku.library.restservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "requests")
public class Request {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer priority;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToOne
	@JoinColumn(name="item_id")
	private Item item;
}
