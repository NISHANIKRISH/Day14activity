package com;

public class Employee {
	private String firstName;
    private String lastName;
    private Department department;
    private Designation designation;
	public Employee(String firstName, String lastName, Department department, Designation designation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Department getDepartment() {
		return department;
	}
	public Designation getDesignation() {
		return designation;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName +"\n"+ ", lastName=" + lastName + "\n"+", department=" + department
				+"\n"+ ", designation=" + designation +"]";
	}
	
	
}
