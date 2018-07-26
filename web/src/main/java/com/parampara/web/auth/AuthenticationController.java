package com.parampara.web.auth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Authentication controller.
 * 
 * @author Raji Thangaraj
 *
 */
@RestController
public class AuthenticationController {
	
	@RequestMapping("/authenticate")
	public AuthResponse authenticate(AuthenticateRequest request) {
		return null;
	}

}
