package com.practice;

import org.springframework.stereotype.Component;

@Component(value = "b1")
public class B {
	
	public void funB() {
		System.out.println("inside funB of B");
	}
	
}
