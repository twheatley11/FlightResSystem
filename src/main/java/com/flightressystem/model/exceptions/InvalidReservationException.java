package com.flightressystem.model.exceptions;

/**
 * @author Tasha Wheatley
 * @since 4/4/20
 */

public class InvalidReservationException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public InvalidReservationException() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public InvalidReservationException (String s) {
		 super(s); // call base class constructor
		 s = "Invalid Travel Reservation";
		 }


}
