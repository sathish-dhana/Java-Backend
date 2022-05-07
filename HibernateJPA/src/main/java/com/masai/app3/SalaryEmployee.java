package com.masai.app3;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="eid")
public class SalaryEmployee extends Employee1 {
	private int salary;

	public SalaryEmployee(String name, int salary) {
		super(name);
		this.salary = salary;
	}

	public SalaryEmployee(String name) {
		super(name);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SalaryEmployee [salary=" + salary + "]";
	}
	
	
}
