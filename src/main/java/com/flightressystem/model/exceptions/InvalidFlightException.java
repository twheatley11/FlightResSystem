package com.flightressystem.model.exceptions;

/**
 * @author Tasha Wheatley
 * @since 4/4/20
 */

public class InvalidFlightException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public InvalidFlightException() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public InvalidFlightException (String s) {
		 super(s); // call base class constructor
		 s = "Invalid Flight Number";
		 }

}
