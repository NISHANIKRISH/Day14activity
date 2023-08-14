package com;
import java.util.stream.Stream;

public class Builderexample {

	
	    public static void main(String[] args) {
	        Stream<String> valuesStream = Stream.<String>builder()
	                .add("BaudeRate")
	                .add("Ohm")
	                .add("Kilowatt")
	                .add("Bits")
	                .add("Analog")
	                .add("Digital")
	                .build();

	        valuesStream.forEach(System.out::println);
	    }
	}

