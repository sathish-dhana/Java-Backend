package com.Practice1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.processing.Generated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class A {
	
	@Autowired(required = true)
	@Qualifier("obj")
	B obj;
	int k;
	
	
	@PostConstruct
	public void setUp() {
	System.out.println("inside set up method");
	this.k = 32;
	}
	
	@PreDestroy
	public void tearDown(){
	System.out.println("inside tear down method");
	}
	
	public void funA() {
		obj.funB();
		System.out.println("inside funA of A" + "iam k" + k);
	}
	
}
