package com.masai.Dao;

import java.util.List;

import com.masai.bean.Employee;
import com.masai.exception.EmployeeException;

public interface EmployeeDao {
	public String saveEmployeeDetails(Employee employee);

	public Employee getEmployeeById(int empId) throws EmployeeException;

	public List<Employee> getAllEmployees();

	public String deleteEmployee(int empId)throws EmployeeException;
}
