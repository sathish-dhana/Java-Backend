package com.Question2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan("com.Question2")
public class AppConfig {
	
	@Bean
	@Order(2)
	public Student st1() {
		return new Student("dhana");
	}
	@Bean
	@Order(4)
	public Student st2() {
		return new Student("sekar");
	}
	@Bean
	@Order(1)
	public Student st3() {
		return new Student("sathish");
	}
	@Bean
	@Order(3)
	public Student st4() {
		return new Student("gowtham");
	}
	
}
