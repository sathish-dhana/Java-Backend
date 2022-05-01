package com.Question2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private String name;
	
	public Student() {
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
