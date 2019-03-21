package com.ipan97.springbootauditsample.security;

/**
 * @author ipan.rahman
 *
 * Constants for Spring Security authorities.
 */
public final class AuthoritiesConstants {

	public static final String ADMIN = "ROLE_ADMIN";

	public static final String USER = "ROLE_USER";

	public static final String ANONYMOUS = "ROLE_ANONYMOUS";

	private AuthoritiesConstants() {
	}
}
