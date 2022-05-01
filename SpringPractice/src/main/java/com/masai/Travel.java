package com.masai;

public class Travel {
	
	//it is the dependency (object type)
	Student v;
	
	//simple type
//	int numberOFPerson;
	
	//setter injection point for numberOfPerson
	public Travel(Student v) {
		this.v = v;
	}
	
	public void journey() {
		v.go();
		System.out.println("Jounrney started...");
	}
}
