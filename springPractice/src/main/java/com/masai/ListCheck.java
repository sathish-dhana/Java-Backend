package com.masai;

import java.util.List;
import java.util.Properties;

public class ListCheck {
	
	private Properties theProperties;
	
	public void setTheProperties(Properties theProperties) {
		this.theProperties = theProperties;
	}
		
	public void show() {
		System.out.println("inside showA of A ");
		System.out.println(theProperties);
	}
	
}
