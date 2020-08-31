package com.flightressystem.model.domain;

import java.io.Serializable;

/**
 * @author Tasha Wheatley
 * @since 3/21/20
 */

public class CustomerLogin implements Serializable{
	
	/*Domain CustomerLogin class that holds input username and password
	 */
	
	private static final long serialVersionUID = 1L; //Universal version identifier for a Serializable class.
	
	private String username;
	
	private String password;
	
	private Boolean loggedIn = false; //Tracks success of Login
	
	
	
	public boolean validate ()
	 {
	 if (username == null) return false;
	 if (password == null) return false;
	 return true;
	 }
	
	public boolean loggedIn (String userName, String password) {
		
		if (userName == this.username && password == this.password) return true;
		return false;
	}
	
	

	public CustomerLogin() {
		super();
	}
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String userName) {
		this.username = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Boolean getLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(Boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerLogin other = (CustomerLogin) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CustomerLogin [userName=" + username + ", password=" + password + "]";
	}

	
	
	
}
