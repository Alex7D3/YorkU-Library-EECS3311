package com.yorku.library.restservice.security;

import java.io.IOException;
import org.springframework.lang.NonNull;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import com.yorku.library.restservice.models.User;
import com.yorku.library.restservice.services.JWTService;
import com.yorku.library.restservice.services.UserDetailsServiceImp;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;


@Component
public class JWTAuthFilter extends OncePerRequestFilter {
		private final JWTService jwtService;
		private final UserDetailsServiceImp userDetailsService;
		
		public JWTAuthFilter(JWTService jwtService, UserDetailsServiceImp userDetailsService) {
			this.jwtService = jwtService;
			this.userDetailsService = userDetailsService;
		}
	
		@Override
		protected void doFilterInternal(
		        @NonNull HttpServletRequest request, 
		        @NonNull HttpServletResponse response, 
		        @NonNull FilterChain filterChain)
		        throws ServletException, IOException {

		    final String authHeader = request.getHeader("Authorization");

		    String token = null;
		    String username = null;

		    if (authHeader != null && authHeader.startsWith("Bearer ")) {
		        token = authHeader.substring(7);
		        username = jwtService.extractUsername(token);
		    }

		    if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
		        UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
		        if (jwtService.isValid(token, userDetails)) {
		            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
		                    userDetails, null, userDetails.getAuthorities());
		            authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
		            SecurityContextHolder.getContext().setAuthentication(authentication);
		        }
		    }

		    filterChain.doFilter(request, response);
		}

}
