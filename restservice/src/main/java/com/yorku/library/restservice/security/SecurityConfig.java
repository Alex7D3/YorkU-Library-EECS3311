package com.yorku.library.restservice.security;

import org.springframework.context.annotation.Configuration;

import org.springframework.http.HttpStatus;

import java.util.Arrays;

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
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

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
	
	private final UserDetailsServiceImp userDetailsServiceImp;
	private final JWTAuthFilter authFilter;
	private final CustomAccessDeniedHandler accessDeniedHandler;
	
	public SecurityConfig(UserDetailsServiceImp userDetailsServiceImp, JWTAuthFilter authFilter, CustomAccessDeniedHandler accessDeniedHandler) {
		this.userDetailsServiceImp = userDetailsServiceImp;
		this.authFilter = authFilter;
		this.accessDeniedHandler = accessDeniedHandler;
	}	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		return http
				.csrf(AbstractHttpConfigurer::disable)
				.csrf().disable()
				.authorizeHttpRequests(
						req -> req.requestMatchers("/login/**", "/register/**")
						.permitAll()
						.anyRequest()
						.authenticated()
						
						
						).userDetailsService(userDetailsService)
						).userDetailsService(userDetailsServiceImp)
						 .exceptionHandling(e->e.accessDeniedHandler(accessDeniedHandler)
								 .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
								 )
						 
						 .sessionManagement(session -> session
								 .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
						 .addFilterBefore(authFilter, UsernamePasswordAuthenticationFilter.class)
						 .build();
	}
	 

	

	@Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList("*")); // Allow all origins
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS")); // Allow all methods
        configuration.setAllowedHeaders(Arrays.asList("*")); // Allow all headers
        configuration.setAllowCredentials(false); // Important if you send requests with credentials, but set to false here

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
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

