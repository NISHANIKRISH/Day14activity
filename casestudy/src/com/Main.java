package com;

	import java.util.ArrayList;
	import java.util.Collections;
import java.util.Comparator;
import java.util.List;
	import java.util.function.Predicate;

	class Customer {
	    String customerName;
	    String planType;
	    String location;
	    float planAmount;
		public Customer(String customerName, String planType, String location, float planAmount) {
			super();
			this.customerName = customerName;
			this.planType = planType;
			this.location = location;
			this.planAmount = planAmount;
		}
		public Customer() {
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getPlanType() {
			return planType;
		}
		public void setPlanType(String planType) {
			this.planType = planType;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public float getPlanAmount() {
			return planAmount;
		}
		public void setPlanAmount(float planAmount) {
			this.planAmount = planAmount;
		}

	  
	}

	public class Main {
	    public static void main(String[] args) {
	        List<Customer> customerList = new ArrayList<>();
	        customerList.add(createCustomer("John", "Basic", "CityA", 150));
	        customerList.add(createCustomer("Alice", "Premium", "CityB", 300));
	        customerList.add(createCustomer("Bob", "Standard", "CityC", 180));
	        
	        Collections.sort(customerList, Comparator.comparingDouble(Customer::getPlanAmount));

	       
	        customerList.forEach(System.out::println);

	    
	        Predicate<Customer> planAmountFilter = customer -> customer.getPlanAmount() >= 200;
	        customerList.removeIf(planAmountFilter.negate());

	        
	        System.out.println("Customers with planAmount >= 200:");
	        customerList.forEach(System.out::println);
	    }

	    @Override
		public String toString() {
			return "Main [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}

		public static Customer createCustomer(String name, String plan, String location, float amount) {
	        Customer customer = new Customer();
	        customer.customerName = name;
	        customer.planType = plan;
	        customer.location = location;
	        customer.planAmount = amount;
	        return customer;
	    }
	}

