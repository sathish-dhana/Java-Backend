package com.masai;

class Bike implements Vehicle{
	
	public void ride() {
		System.out.println("bike ride started....");
	}
	
	@Override
	public void go() {
		ride();
	}
}