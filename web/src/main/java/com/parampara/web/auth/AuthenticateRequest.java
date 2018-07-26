package com.parampara.web.auth;

/**
 * Authentication request.
 * 
 * @author Raji Thangaraj
 * @Version 1.0
 */
public class AuthenticateRequest {

	public String userName;
	public String password;
	
	public AuthenticateRequest(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

}
