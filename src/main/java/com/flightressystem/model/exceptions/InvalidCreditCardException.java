package com.flightressystem.model.exceptions;

/**
 * @author Tasha Wheatley
 * @since 4/4/20
 */

public class InvalidCreditCardException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public InvalidCreditCardException() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public InvalidCreditCardException (String s) {
		 super(s); // call base class constructor
		 s = "Invalid Credit Card Type, Number, or Expiration Date";
		 }

}
