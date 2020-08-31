package com.flightressystem.model.exceptions;

/**
 * @author Tasha Wheatley
 * @since 4/4/20
 */

public class LoginNotFoundException extends Exception{
	
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoginNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginNotFoundException (String s) {
		 super(s); // call base class constructor
		 s = "Invalid username or password";
		 }

}
