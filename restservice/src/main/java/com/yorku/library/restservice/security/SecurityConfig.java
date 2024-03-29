package com.yorku.library.restservice.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.yorku.library.restservice.services.UserDetailsServiceImp;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	private final UserDetailsServiceImp userDetailsService;
	private final JWTAuthFilter authFilter;
	
	public SecurityConfig(UserDetailsServiceImp userDetailsService, JWTAuthFilter authFilter) {
		this.userDetailsService = userDetailsService;
		this.authFilter = authFilter;
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		return http
				.csrf(AbstractHttpConfigurer::disable)
				.authorizeHttpRequests(
						req -> req.requestMatchers("/login/**", "/register/**")
						.permitAll()
						.anyRequest()
						.authenticated()
						
						
						).userDetailsService(userDetailsService)
						 .sessionManagement(session -> session
								 .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
						 .addFilterBefore(authFilter, UsernamePasswordAuthenticationFilter.class)
						 .build();
	}
	
	@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	@Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }
 }
