package com.springmvc.exceptions;

public class UserNotFoundException extends RuntimeException {
	
	public UserNotFoundException(String ue)
	{
		super(ue);
	}
	
}
