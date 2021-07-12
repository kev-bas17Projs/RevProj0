package com.revature.exceptions;

public class InvalidCredentialsException extends RuntimeException {
	private static long serialVersionUID = 1L;

	public InvalidCredentialsException() {
		super("User provided invalid credentials.");
	}
}
