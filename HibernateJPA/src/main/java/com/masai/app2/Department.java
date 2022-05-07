package com.masai.app2;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deptId;
	
	private String deptName;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "dept")
	private List<Employee> emp;
	
	public Department() {
		super();
	}

	public Department(String deptName) {
		super();
		this.deptName = deptName;
	}
	
	public int getDeptId() {
		return deptId;
	}
	
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public List<Employee> getEmp() {
		return emp;
	}
	
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", emp=" + emp + "]";
	}
	
	
}
