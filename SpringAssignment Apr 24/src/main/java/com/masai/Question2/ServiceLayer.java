package com.masai.Question2;

public class ServiceLayer implements Calculator {
		
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public int subtract(int a, int b) {
		return a-b;
	}
}
