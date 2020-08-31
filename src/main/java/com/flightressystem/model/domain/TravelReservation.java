package com.flightressystem.model.domain;

import java.io.Serializable;

/**
 * @author Tasha Wheatley
 * @since 3/21/20
 */

public class TravelReservation implements Serializable{
	
	/*
	 * Reservation object that holds customer's personal information, their itinerary information,
	 * and list of available flights.  Once the customer selects a flight then this holds their 
	 * reservation while they decide whether or not to complete the booking.
	 */
	
	
	/*
	 * Universal version identifier for a Serializable class. Deserialization uses this number to ensure 
	 * that a loaded class corresponds exactly to a serialized object. If no match is found, then an 
	 * InvalidClassException is thrown.
	 */
	private static final long serialVersionUID = 1L;
	
	private Customer customer;   //Holds infomormation about the customer
	
	private TravelItinerary travelItinerary;   //Holds information about the customer's travel itinerary
	
	private AvailableFlights availableFlights; //Hold's list of available flights
	
	private Flight flight;   //Chosen flight information


	//constructor without parameters
	public TravelReservation() {
		super();
	}

	
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the travelItinerary
	 */
	public TravelItinerary getTravelItinerary() {
		return travelItinerary;
	}

	/**
	 * @param travelItinerary the travelItinerary to set
	 */
	public void setTravelItinerary(TravelItinerary travelItinerary) {
		this.travelItinerary = travelItinerary;
	}

	/**
	 * @return the availableFlights
	 */
	public AvailableFlights getAvailableFlights() {
		return availableFlights;
	}

	/**
	 * @param availableFlights the availableFlights to set
	 */
	public void setAvailableFlights(AvailableFlights availableFlights) {
		this.availableFlights = availableFlights;
	}

	/**
	 * @return the flight
	 */
	public Flight getFlight() {
		return flight;
	}

	/**
	 * @param flight the flight to set
	 */
	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((availableFlights == null) ? 0 : availableFlights.hashCode());
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((flight == null) ? 0 : flight.hashCode());
		result = prime * result + ((travelItinerary == null) ? 0 : travelItinerary.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof TravelReservation))
			return false;
		TravelReservation other = (TravelReservation) obj;
		if (availableFlights == null) {
			if (other.availableFlights != null)
				return false;
		} else if (!availableFlights.equals(other.availableFlights))
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (flight == null) {
			if (other.flight != null)
				return false;
		} else if (!flight.equals(other.flight))
			return false;
		if (travelItinerary == null) {
			if (other.travelItinerary != null)
				return false;
		} else if (!travelItinerary.equals(other.travelItinerary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TravelReservation [customer=" + customer + ", travelItinerary=" + travelItinerary
				+ ", availableFlights=" + availableFlights + ", flight=" + flight + "]";
	}
	
}
