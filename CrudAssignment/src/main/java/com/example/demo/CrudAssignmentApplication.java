package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class CrudAssignmentApplication {

	public static void main(String[] args) {
		ApplicationContext ap = SpringApplication.run(CrudAssignmentApplication.class, args);
	}

}
