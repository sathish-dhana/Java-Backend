package com.Question1.DataAccessLayer;

import java.util.List;

import com.Question1.Beans.Employee;

public interface EmployeeRepo {
	public Employee insertEmployeeDetails(Employee emp);
	public List<Employee> getAllEmployeeDetails();
	public Employee findEmployee(int empId);
	public String deleteEmployeeDetailsById(int empId);
}
