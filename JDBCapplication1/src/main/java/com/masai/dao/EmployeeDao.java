package com.masai.dao;

import java.util.List;

import com.masai.Excepions.EmployeeException;
import com.masai.bean.Employee;



public interface EmployeeDao {
	
	public Employee getEmployeeById(int empId)throws EmployeeException;

	public List<Employee> getAllEmployee();

	public String saveEmployeeDetails(Employee employee);

	public boolean deleteEmployeeById(int empId)throws EmployeeException;

	public String giveBonusToEmployee(int empId, int amount)throws EmployeeException;
}
