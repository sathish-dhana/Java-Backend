package com.Question2;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cities {
	
	@Value("${Question2.String}") 
	private List<String> myList;
	
	public void print() {
		System.out.println(myList);
	}
}
