package com;

	import java.util.Iterator;
	import java.util.stream.Stream;

	public class Maincl {
	    public static void main(String[] args) {
	        Stream<Long> fibonacciStream = Stream.iterate(new long[]{0, 1}, arr -> new long[]{arr[1], arr[0] + arr[1]})
	                .map(arr -> arr[0]);

	        fibonacciStream.limit(10)  // Limit to the first 10 numbers
	                .forEach(System.out::println);
	    }
	}

