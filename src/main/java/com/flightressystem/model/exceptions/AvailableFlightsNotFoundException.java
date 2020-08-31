package com.flightressystem.model.exceptions;

public class AvailableFlightsNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public AvailableFlightsNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AvailableFlightsNotFoundException (String s) {
		 super(s); // call base class constructor
		 s = "No available flights found";
		 }


}
