package com;

import java.util.function.Predicate;

public class EvenNumberFilter {
	public static void main(String[] args) {
	 int[] arr={12,23,11,19,25,32,16,22};

	Predicate<Integer> isEven=EvenNumberFilter::isEvenNumber;
	for(int num:arr) {
		if(isEven.test(num)) {
			System.out.println(num);
		}
	}
	 
}
	private static boolean isEvenNumber(int num) {
		return num%2==0;
	}
}