package com.flightressystem.model.domain;

import java.io.Serializable;

/**
 * @author Tasha Wheatley
 * @since 3/21/20
 */

public class Flight implements Serializable {
	
	/*Domain Flight class that holds all information about the flight including
	 * flight number, departure/arrival date/time and location, number of business/economy
	 * seats available, and cost
	 */
	
	
	/*
	 * Universal version identifier for a Serializable class. Deserialization uses this number to ensure 
	 * that a loaded class corresponds exactly to a serialized object. If no match is found, then an 
	 * InvalidClassException is thrown.
	 */
	private static final long serialVersionUID = 1L;
	
	private String flightNum; 
	
	private String departureLocation; // Location of departure
	private String departureMonth;    //Month of departure
	private String departureDay;      //Day of departure
	private String departureYear;     //Year of departure
	private String departureTime;     //Time of departure
	
	private String arrivalLocation;  //Location of arrival
	private String arrivalMonth;	 //Month of arrival
	private String arrivalDay;       //Day of arrival
	private String arrivalYear;      //Year of arrival
	private String arrivalTime;      //Time of arrival

	private Integer busSeatsAvail;   //Number of seats available in business class
	private Integer econSeatsAvail;  //Number of seats available in economy class
	private Integer flightCost; 	 //Cost of the flight
	
	
	//public void reserveFlight() {}   //Flight to make a reservation for future implementation
	
	public boolean validate() {
		if (flightNum == null)
			return false;
		if (departureLocation == null)
			return false;
		if (departureMonth == null)
			return false;
		if (departureDay == null)
			return false;
		if (departureYear == null)
			return false;
		if (departureTime == null)
			return false;
		if (arrivalLocation == null)
			return false;
		if (arrivalMonth == null)
			return false;
		if (arrivalDay == null)
			return false;
		if (arrivalYear == null)
			return false;
		if (arrivalTime == null)
			return false;	
		if (busSeatsAvail == null)
			return false;
		if (econSeatsAvail == null)
			return false;
		if (flightCost == null)
			return false;

		return true;
	}


	public Flight() {
		super();
	}


	/**
	 * @return the flightNum
	 */
	public String getFlightNum() {
		return flightNum;
	}


	/**
	 * @param flightNum the flightNum to set
	 */
	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}


	/**
	 * @return the departureLocation
	 */
	public String getDepartureLocation() {
		return departureLocation;
	}


	/**
	 * @param departureLocation the departureLocation to set
	 */
	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}


	/**
	 * @return the departureMonth
	 */
	public String getDepartureMonth() {
		return departureMonth;
	}


	/**
	 * @param departureMonth the departureMonth to set
	 */
	public void setDepartureMonth(String departureMonth) {
		this.departureMonth = departureMonth;
	}


	/**
	 * @return the departureDay
	 */
	public String getDepartureDay() {
		return departureDay;
	}


	/**
	 * @param departureDay the departureDay to set
	 */
	public void setDepartureDay(String departureDay) {
		this.departureDay = departureDay;
	}


	/**
	 * @return the departureYear
	 */
	public String getDepartureYear() {
		return departureYear;
	}


	/**
	 * @param departureYear the departureYear to set
	 */
	public void setDepartureYear(String departureYear) {
		this.departureYear = departureYear;
	}


	/**
	 * @return the departureTime
	 */
	public String getDepartureTime() {
		return departureTime;
	}


	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}


	/**
	 * @return the arrivalLocation
	 */
	public String getArrivalLocation() {
		return arrivalLocation;
	}


	/**
	 * @param arrivalLocation the arrivalLocation to set
	 */
	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}


	/**
	 * @return the arrivalMonth
	 */
	public String getArrivalMonth() {
		return arrivalMonth;
	}


	/**
	 * @param arrivalMonth the arrivalMonth to set
	 */
	public void setArrivalMonth(String arrivalMonth) {
		this.arrivalMonth = arrivalMonth;
	}


	/**
	 * @return the arrivalDay
	 */
	public String getArrivalDay() {
		return arrivalDay;
	}


	/**
	 * @param arrivalDay the arrivalDay to set
	 */
	public void setArrivalDay(String arrivalDay) {
		this.arrivalDay = arrivalDay;
	}


	/**
	 * @return the arrivalYear
	 */
	public String getArrivalYear() {
		return arrivalYear;
	}


	/**
	 * @param arrivalYear the arrivalYear to set
	 */
	public void setArrivalYear(String arrivalYear) {
		this.arrivalYear = arrivalYear;
	}


	/**
	 * @return the arrivalTime
	 */
	public String getArrivalTime() {
		return arrivalTime;
	}


	/**
	 * @param arrivalTime the arrivalTime to set
	 */
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}


	/**
	 * @return the busSeatsAvail
	 */
	public Integer getBusSeatsAvail() {
		return busSeatsAvail;
	}


	/**
	 * @param busSeatsAvail the busSeatsAvail to set
	 */
	public void setBusSeatsAvail(Integer busSeatsAvail) {
		this.busSeatsAvail = busSeatsAvail;
	}


	/**
	 * @return the econSeatsAvail
	 */
	public Integer getEconSeatsAvail() {
		return econSeatsAvail;
	}


	/**
	 * @param econSeatsAvail the econSeatsAvail to set
	 */
	public void setEconSeatsAvail(Integer econSeatsAvail) {
		this.econSeatsAvail = econSeatsAvail;
	}


	/**
	 * @return the flightCost
	 */
	public Integer getFlightCost() {
		return flightCost;
	}


	/**
	 * @param flightCost the flightCost to set
	 */
	public void setFlightCost(Integer flightCost) {
		this.flightCost = flightCost;
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
		result = prime * result + ((arrivalDay == null) ? 0 : arrivalDay.hashCode());
		result = prime * result + ((arrivalLocation == null) ? 0 : arrivalLocation.hashCode());
		result = prime * result + ((arrivalMonth == null) ? 0 : arrivalMonth.hashCode());
		result = prime * result + ((arrivalTime == null) ? 0 : arrivalTime.hashCode());
		result = prime * result + ((arrivalYear == null) ? 0 : arrivalYear.hashCode());
		result = prime * result + ((busSeatsAvail == null) ? 0 : busSeatsAvail.hashCode());
		result = prime * result + ((departureDay == null) ? 0 : departureDay.hashCode());
		result = prime * result + ((departureLocation == null) ? 0 : departureLocation.hashCode());
		result = prime * result + ((departureMonth == null) ? 0 : departureMonth.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((departureYear == null) ? 0 : departureYear.hashCode());
		result = prime * result + ((econSeatsAvail == null) ? 0 : econSeatsAvail.hashCode());
		result = prime * result + ((flightCost == null) ? 0 : flightCost.hashCode());
		result = prime * result + ((flightNum == null) ? 0 : flightNum.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Flight))
			return false;
		Flight other = (Flight) obj;
		if (arrivalDay == null) {
			if (other.arrivalDay != null)
				return false;
		} else if (!arrivalDay.equals(other.arrivalDay))
			return false;
		if (arrivalLocation == null) {
			if (other.arrivalLocation != null)
				return false;
		} else if (!arrivalLocation.equals(other.arrivalLocation))
			return false;
		if (arrivalMonth == null) {
			if (other.arrivalMonth != null)
				return false;
		} else if (!arrivalMonth.equals(other.arrivalMonth))
			return false;
		if (arrivalTime == null) {
			if (other.arrivalTime != null)
				return false;
		} else if (!arrivalTime.equals(other.arrivalTime))
			return false;
		if (arrivalYear == null) {
			if (other.arrivalYear != null)
				return false;
		} else if (!arrivalYear.equals(other.arrivalYear))
			return false;
		if (busSeatsAvail == null) {
			if (other.busSeatsAvail != null)
				return false;
		} else if (!busSeatsAvail.equals(other.busSeatsAvail))
			return false;
		if (departureDay == null) {
			if (other.departureDay != null)
				return false;
		} else if (!departureDay.equals(other.departureDay))
			return false;
		if (departureLocation == null) {
			if (other.departureLocation != null)
				return false;
		} else if (!departureLocation.equals(other.departureLocation))
			return false;
		if (departureMonth == null) {
			if (other.departureMonth != null)
				return false;
		} else if (!departureMonth.equals(other.departureMonth))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (departureYear == null) {
			if (other.departureYear != null)
				return false;
		} else if (!departureYear.equals(other.departureYear))
			return false;
		if (econSeatsAvail == null) {
			if (other.econSeatsAvail != null)
				return false;
		} else if (!econSeatsAvail.equals(other.econSeatsAvail))
			return false;
		if (flightCost == null) {
			if (other.flightCost != null)
				return false;
		} else if (!flightCost.equals(other.flightCost))
			return false;
		if (flightNum == null) {
			if (other.flightNum != null)
				return false;
		} else if (!flightNum.equals(other.flightNum))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Flight [flightNum=" + flightNum + ", departureLocation=" + departureLocation + ", departureMonth="
				+ departureMonth + ", departureDay=" + departureDay + ", departureYear=" + departureYear
				+ ", departureTime=" + departureTime + ", arrivalLocation=" + arrivalLocation + ", arrivalMonth="
				+ arrivalMonth + ", arrivalDay=" + arrivalDay + ", arrivalYear=" + arrivalYear + ", arrivalTime="
				+ arrivalTime + ", busSeatsAvail=" + busSeatsAvail + ", econSeatsAvail=" + econSeatsAvail
				+ ", flightCost=" + flightCost + "]";
	}
	
	

}
