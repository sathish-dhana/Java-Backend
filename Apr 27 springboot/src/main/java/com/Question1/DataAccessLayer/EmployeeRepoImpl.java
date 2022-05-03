package com.Question1.DataAccessLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Question1.Beans.Employee;
import com.Question1.DBservice.EmployeeService;
import com.Question1.Exception.EmployeeException;

@Service
public class EmployeeRepoImpl implements EmployeeRepo {
	
	@Autowired
	EmployeeService service;
	
	@Override
	public Employee insertEmployeeDetails(Employee emp) {
		// TODO Auto-generated method stub
		
		Employee emp1 = null;
		
		emp1 = service.saveEmployee(emp);
		
		return emp1;
	}

	@Override
	public List<Employee> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		
		return service.getAllEmployee();
	}

	@Override
	public Employee findEmployee(int empId) {
		// TODO Auto-generated method stub
		Employee emp = null;
		try {
			emp = service.getEmployeeById(empId);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}

	@Override
	public String deleteEmployeeDetailsById(int empId) {
		// TODO Auto-generated method stub			
		String str = null;
		try {
			str = service.deleteEmployeeById(empId);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}

}
