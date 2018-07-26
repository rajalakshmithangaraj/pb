package com.parampara.web.auth;

/**
 * Authentication Response clasa.
 * 
 * @author Raji Thangaraj
 * @Version 1.0
 *
 */
public class  AuthResponse {
	
	private final String sessionToken;
	
	public AuthResponse(String sessionToken) {
		this.sessionToken = sessionToken;
	}
	
	public String getSessionToken() {
		return this.sessionToken;
	}

}
