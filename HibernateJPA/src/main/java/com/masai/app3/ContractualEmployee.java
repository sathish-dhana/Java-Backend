package com.masai.app3;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="eid")
public class ContractualEmployee extends Employee1 {
	
	private int noOfWorkingDays;
	private int costPerDay;
	
	
	public ContractualEmployee(String name) {
		super(name);
	}


	public ContractualEmployee(String name, int noOfWorkingDays, int costPerDay) {
		super(name);
		this.noOfWorkingDays = noOfWorkingDays;
		this.costPerDay = costPerDay;
	}


	public int getNoOfWorkingDays() {
		return noOfWorkingDays;
	}


	public void setNoOfWorkingDays(int noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}


	public int getCostPerDay() {
		return costPerDay;
	}


	public void setCostPerDay(int costPerDay) {
		this.costPerDay = costPerDay;
	}


	@Override
	public String toString() {
		return "ContractualEmployee [noOfWorkingDays=" + noOfWorkingDays + ", costPerDay=" + costPerDay + "]";
	}

	
}
