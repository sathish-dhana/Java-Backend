package com.Question2;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class StudentService {
	
	@Autowired(required = false)
	List<Student> student;

	@PostConstruct
	public void print() {
		System.out.println(student);
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Object destroyed");
	}
}
