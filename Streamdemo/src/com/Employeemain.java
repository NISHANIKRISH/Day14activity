package com;


	import java.util.*;
	import java.util.stream.Collectors;

	public class Employeemain {
	    public static void main(String[] args) {
	    	List<Employee> employees = new ArrayList<>();

	        Employee employee1 = new Employee("John", "Doe", new Department("Sales", "New York"), new Designation("Manager"));
	        Employee employee2 = new Employee("Jane", "Smith", new Department("HR", "Mumbai"), new Designation("Manager"));
	        Employee employee3 = new Employee("Michael", "Johnson", new Department("Sales", "London"), new Designation("Employee"));
	        Employee employee4 = new Employee("Emily", "Williams", new Department("IT", "Mumbai"), new Designation("Employee"));

	        employees.add(employee1);
	        employees.add(employee2);
	        employees.add(employee3);
	        employees.add(employee4);
	        List<Employee> salesManagers = employees.stream()
	                .filter(employee -> employee.getDepartment().getDepartmentName().equals("Sales"))
	                .filter(employee -> employee.getDesignation().getDesignationType().equals("Manager"))
	                .collect(Collectors.toList());

	        List<Employee> mumbaiEmployees = employees.stream()
	                .filter(employee -> employee.getDepartment().getLocation().equals("Mumbai"))
	                .collect(Collectors.toList());

	        List<String> employeeNames = employees.stream()
	                .map(employee -> employee.getFirstName() + " " + employee.getLastName())
	                .collect(Collectors.toList());
	        System.out.println("Sales Managers:");
	        salesManagers.forEach(employee -> System.out.println(employee.getFirstName() + " " + employee.getLastName()));

	        System.out.println("\nMumbai Employees:");
	        mumbaiEmployees.forEach(employee -> System.out.println(employee.getFirstName() + " " + employee.getLastName()));

	        System.out.println("\nEmployee Names:");
	        employeeNames.forEach(System.out::println);
	    

}}
