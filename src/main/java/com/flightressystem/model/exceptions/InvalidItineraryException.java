package com.flightressystem.model.exceptions;

/**
 * @author Tasha Wheatley
 * @since 4/4/20
 */

public class InvalidItineraryException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public InvalidItineraryException() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public InvalidItineraryException (String s) {
		 super(s); // call base class constructor
		 s = "Invalid Travel Itinerary";
		 }

	

}
