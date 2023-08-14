package com;

public class Department {
	private String departmentName;
    private String location;
	public Department(String departmentName, String location) {
		super();
		this.departmentName = departmentName;
		this.location = location;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public String getLocation() {
		return location;
	}
	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", location=" + location + "]";
	}
    
}
