package com.flightressystem.model.exceptions;

/**
 * @author Tasha Wheatley
 * @since 4/4/20
 */

public class InvalidCustomerException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	/**
	 * 
	 */
	public InvalidCustomerException() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public InvalidCustomerException (String s) {
		 super(s); // call base class constructor
		 s = "Invalid Customer Account Number";
		 }
	
}
