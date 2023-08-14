package com;

public class Customerlist {
	private String firstName;  
    private String lastName;
    private String emailId;
    private Location location;
	
	
	public Customerlist(String firstName, String lastName, String emailId, Location location) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.location = location;
	}

	

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}



	@Override
	public String toString() {
		return "Customerlist [firstName=" + firstName  +"\n"+
				" lastName=" + lastName + "\n"+
				" emailId=" + emailId+"\n"
				+ " location=" 
				+ location +"\n"+ "getFirstName()=" + getFirstName() +"\n"+ ", getLastName()=" + getLastName()+"\n"+
				 "getEmailId()=" + getEmailId() +"\n"+ ", getLocation()=" + getLocation()+"\n" + /*", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + */"]";
	}
	
     
       

}
 

