package com.Practice1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class B {
	
	public void funB() {
		System.out.println("inside funB of B");
	}
	
}
