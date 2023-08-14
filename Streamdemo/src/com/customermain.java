package com;
import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class customermain {
	public static void main(String[] args) {
        List<Customerlist> customers = new ArrayList<>();
        customers.add(new Customerlist("Alice", "Johnson", "alice@example.com", new Location("Mumbai", "MH")));
        customers.add(new Customerlist("Bob", "Smith", "bob@example.com", new Location("Delhi", "DL")));
        customers.add(new Customerlist("Charlie", "Brown", "charlie@example.com", new Location("Bangalore", "KA")));

        List<String> customerDetails = customers.stream()
                .map(customer -> customer.getFirstName() + " " + customer.getLastName() + " " + customer.getLocation().getLocationName())
                .collect(Collectors.toList());

        System.out.println(customers);
       
}

}
