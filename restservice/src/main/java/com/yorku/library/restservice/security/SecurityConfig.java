package com.yorku.library.restservice.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	
	@Bean
	public UserDetailsService users(){
		UserDetails admin = User.builder()
				.username("meow")
				.password("meow")
				.roles("ADMIN")
				.build();
		
		UserDetails user = User.builder()
				.username("woof")
				.password("woof")
				.roles("USER")
				.build();
				
				return new InMemoryUserDetailsManager(admin, user);
		
		}
 }
