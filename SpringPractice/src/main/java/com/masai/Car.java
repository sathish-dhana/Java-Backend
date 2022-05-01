package com.masai;

class Car implements Student {
	
	public void start() {
		System.out.println("Car started...");
	}
	
	@Override
	public void go() {
		start();
	}
}
