package com.masai.Question2;

public class PresentationLayer {
	ServiceLayer service;
	
	public void setService(ServiceLayer service) {
		this.service = service;
	}
	
	public void sum(int a, int b) {
		int sum = service.sum(a, b);
		System.out.println("sum is : " + sum);
	}
	
	public void multiply(int a, int b) {
		int multiply = service.multiply(a, b);
		System.out.println("multiplication is : " + multiply);
	}
	
	public void subtract(int a, int b) {
		int subtract = service.subtract(a, b);
		System.out.println("subract is : " + subtract);
	}
	
}
