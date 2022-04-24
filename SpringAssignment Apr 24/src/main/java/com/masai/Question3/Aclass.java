package com.masai.Question3;

public class Aclass {
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void destroy() {
		System.out.println("destroyed");
	}
	
	public void setup() {
		System.out.println("Class Intantiated");
		System.out.println("message is : "+message);
	}
	
	public void method() {
		System.out.println("i called this method");
	}
}
