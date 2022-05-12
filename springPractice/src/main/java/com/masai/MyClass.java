package com.masai;

public class MyClass {
	
	private Travel t;
	
	
	
	public MyClass() {
		super();
	}

	public MyClass(Travel t) {
		super();
		this.t = t;
	}
	
	public void showB() {
		System.out.println("inside showB of B");
	}

	public Travel getT() {
		return t;
	}

	public void setT(Travel t) {
		this.t = t;
	}
	
	
}
