package com.Practice1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.Practice1"})
public class AppConfig {
	
	@Bean(name = "obj")
	public B getB() {
		return new B();
	}
}
