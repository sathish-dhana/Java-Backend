package com.practice;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service(value = "a1")
public class A {
	
	@Autowired(required = false)
	B b2;
	int x;
	
	@PostConstruct
	public void setUp() {
		System.out.println("inside set up method");
		this.x = 10;
	}
	
	@PreDestroy
	public void tearDown(){
	System.out.println("inside tear down method");
	}
	
	public void funA() {
		System.out.println("inside funA of A");
		System.out.println("x = " + x);
		b2.funB();
	}
	
}
