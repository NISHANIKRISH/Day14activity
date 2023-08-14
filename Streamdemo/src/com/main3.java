package com;

	import java.util.stream.Stream;
	import java.util.function.Supplier;

	public class main3 {

	    public static void main(String[] args) {
	        Stream<Long> primeStream = Stream.generate(new PrimeGenerator());

	        primeStream.limit(10)  
	                .forEach(System.out::println);
	    }

	    static class PrimeGenerator implements Supplier<Long> {
	        long next = 2;

	        @Override
	        public Long get() {
	            while (!isPrime(next)) {
	                next++;
	            }
	            long current = next;
	            next++;
	            return current;
	        }

	        private boolean isPrime(long number) {
	            if (number <= 1) {
	                return false;
	            }
	            for (long i = 2; i <= Math.sqrt(number); i++) {
	                if (number % i == 0) {
	                    return false;
	                }
	            }
	            return true;
	        }
	    }
	}


