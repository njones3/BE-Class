package com.promineotech;

import java.util.Random;

public class TestDemo {
	
	public int addPositive (int a, int b) {
		
		int sum;
		if (a > 0 && b > 0) {
		sum = a + b;
		} else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
		return sum;
	}
	
	
	/*
	 * My own method testing out multiplication.
	 */
	public int multiply (int a, int b) {
		return a * b;
	}
	
	public int randomNumberSquared() {
		
		int randomNumber = getRandomInt();
		return randomNumber * randomNumber;
		
	}
	
	int getRandomInt() {
		
		Random random = new Random();
		return random.nextInt(10) + 1;
		
	}
}