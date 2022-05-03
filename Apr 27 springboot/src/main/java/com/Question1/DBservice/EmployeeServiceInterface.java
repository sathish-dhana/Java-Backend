package com.Question1.DBservice;

import java.util.List;

import com.Question1.Beans.Employee;
import com.Question1.Exception.EmployeeException;

public interface EmployeeServiceInterface {
	public Employee saveEmployee(Employee emp);
	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(int empId)throws EmployeeException;
	public String deleteEmployeeById(int empId)throws EmployeeException;
}
