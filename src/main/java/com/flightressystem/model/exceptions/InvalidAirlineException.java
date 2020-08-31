package com.flightressystem.model.exceptions;

/**
 * @author Tasha Wheatley
 * @since 4/4/20
 */

public class InvalidAirlineException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public InvalidAirlineException() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public InvalidAirlineException (String s) {
		 super(s); // call base class constructor
		 s = "Invalid Airline Code";
		 }
}
