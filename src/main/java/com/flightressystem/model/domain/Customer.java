package com.flightressystem.model.domain;

import java.io.Serializable;

/**
 * @author Tasha Wheatley
 * @since 3/21/20
 */

public class Customer implements Serializable {
	
	/*Domain Customer class that holds all registration information about the customer including
	 * name, address, email, credit card information (optional),travel itinerary,
	 * and login information in order to verify customer
	 */
	
	
	/*
	 * Universal version identifier for a Serializable class. Deserialization uses this number to ensure 
	 * that a loaded class corresponds exactly to a serialized object. If no match is found, then an 
	 * InvalidClassException is thrown.
	 */
	private static final long serialVersionUID = 1111111111111111L;
	private String lastName;     //Customer last name
	private String firstName;    // Customer first name
	private String userName;     //Customer user name
	private String password;     //Customer user name
	private String emailAddress; //Customer email address
	private String address;      //Customer address	
	private String city;         //Customer city	 
	private String state;        //Customer state	
	private Integer zipCode;	 // Customer zip code
	private Integer custID;
	
	private CustomerLogin customerLogin; //Customer login information submitted
	private TravelItinerary travelItinerary;  //Customer travel itinerary for one direction of flight	
	private CreditCard creditCard; //Customer credit card information (optional)
	
public static void main(String[] args){
	
		CustomerLogin customerLogin = new CustomerLogin();
		customerLogin.setUsername("twheatley");
		customerLogin.setPassword("12345");
			
		TravelItinerary travelItinerary = new TravelItinerary();
		travelItinerary.setNumPassengers(1);
		travelItinerary.setOneWayTrip(false);
		travelItinerary.setRoundTrip(true);
		travelItinerary.setDepartureLocation("Denver");
		travelItinerary.setDepartureMonth("July");
		travelItinerary.setDepartureDay("30");
		travelItinerary.setDepartureYear("2020");
		travelItinerary.setDepartureTime("10:00 am");
		travelItinerary.setArrivalLocation("Pittsburgh");
		travelItinerary.setArrivalMonth("August");
		travelItinerary.setArrivalDay("5");
		travelItinerary.setArrivalYear("2020");
		travelItinerary.setArrivalTime("2:00 pm");
		
		CreditCard creditCard = new CreditCard();
		creditCard.setCreditCardType("visa");
		creditCard.setCreditCardNum("1234567890123456");
		creditCard.setCreditCardExp("0722");
		
				
		Customer customer1 = new Customer ();
		customer1 = new Customer();
		customer1.setLastName("Wheatley");
		customer1.setFirstName("Tasha");
		customer1.setUserName("twheatley");
		customer1.setPassword("12345");
		customer1.setEmailAddress("twheatley@regis.edu");
		customer1.setAddress("1234 Main Street");
		customer1.setCity("Denver");
		customer1.setState("Colorado");
		customer1.setZipCode(12345);
		customer1.setCustID(11111);
	
		
			System.out.println (customer1);
	}
	
	public boolean validate() {
		if (lastName == null)
			return false;
		if (firstName == null)
			return false;
		if (userName == null)
			return false;
		if (password == null)
			return false;
		if (emailAddress == null)
			return false;
		if (address == null)
			return false;
		if (city == null)
			return false;
		if (state == null)
			return false;
		if (zipCode == null)
			return false;
		if (custID == null)
			return false;

		return true;
	}

	
	
	public Customer() {
		super();
	}
	
		
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zipCode
	 */
	public Integer getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the customerLogin
	 */
	public CustomerLogin getCustomerLogin() {
		return customerLogin;
	}

	/**
	 * @param customerLogin the customerLogin to set
	 */
	public void setCustomerLogin(CustomerLogin customerLogin) {
		this.customerLogin = customerLogin;
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
	 * @return the creditCard
	 */
	public CreditCard getCreditCard() {
		return creditCard;
	}

	/**
	 * @param creditCard the creditCard to set
	 */
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
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
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((creditCard == null) ? 0 : creditCard.hashCode());
		result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((travelItinerary == null) ? 0 : travelItinerary.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Customer))
			return false;
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (creditCard == null) {
			if (other.creditCard != null)
				return false;
		} else if (!creditCard.equals(other.creditCard))
			return false;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (travelItinerary == null) {
			if (other.travelItinerary != null)
				return false;
		} else if (!travelItinerary.equals(other.travelItinerary))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [lastName=" + lastName + ", firstName=" + firstName + ", userName=" + userName + ", password="
				+ password + ", emailAddress=" + emailAddress + ", address=" + address + ", city=" + city + ", state="
				+ state + ", zipCode=" + zipCode + ", travelItinerary=" + travelItinerary + ", creditCard=" + creditCard
				+ "]";
	}

	public Integer getCustID() {
		return custID;
	}

	public void setCustID(Integer custID) {
		this.custID = custID;
	}

	
}
	



