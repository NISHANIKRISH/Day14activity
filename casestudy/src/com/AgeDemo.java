package com;

	import java.util.function.Predicate;

	

	class Candidate {
	    public boolean isAgeValid(int age) {
	        return age > 18;
	    }
	}

	public class AgeDemo {
	    public static void main(String[] args) {
	        int[] agearray = {12, 23, 11, 19, 35, 22};

	        Candidate candidate = new Candidate();

	        // Create a custom Predicate using the isAgeValid method
	        Predicate<Integer> agePredicate = candidate::isAgeValid;

	        // Apply the Predicate to the array
	        for (int age : agearray) {
	            if (agePredicate.test(age)) {
	                System.out.println("valid age");
	            } else {
	                System.out.println("invalid age");
	            }
	        }
	    }
	}